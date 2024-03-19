/*1.Напишите метод, который вернет содержимое текущей папки в виде массива строк.
  2.Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
  3.Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл.
*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task3 {
    private static final Logger logger = Log.log(Task3.class.getName());
    public static void main(String[] args) {

        //System.out.println(Arrays.toString(getFileNames("./.gitignore")));
        writeToFile("Task2.txt", ".");
    }
    private static String[] getFileNames (String path){
        File file = new File (path);
        String[] result = new String[0];
        if (file.isFile()) {
            logger.log(Level.INFO, "Файл не является папкой");
            throw new RuntimeException("Файл не является папкой");
        }
        else {
            File[] filesArr = file.listFiles();
            result = new String[filesArr.length];
            for (int i = 0; i < filesArr.length; i++) {
                result[i]=filesArr[i].getName();
            }

        }
       return result;
    }
    private static void writeToFile (String path, String outPath){
        if (isThrow()) {
            logger.log(Level.INFO, "Случайная ошибка");
        }
        try {
            FileWriter fw = new FileWriter(path);
            String[] names = getFileNames(outPath);
            for (String st: names){
            fw.write(st+"\n");
            }
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    //Случайная ошибка
    private static boolean isThrow() {
        int a = 0;
        int b = 2;
        int digit = a + (int) (Math.random() * b);
        System.out.println(digit);
        return digit > 0;
    }
}
