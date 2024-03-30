//Перевод из римского формата в арабский
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class Seminar53 {
    static String exception = "В строке могут находиться только [I, V, X, L, C, D, M]";
    public static void main(String[] args) {
        String y1994 = "MCMXCIV";
        System.out.println(romanToArabicNums("CM"));
    }

    private static int romanToArabicNums(String roman) {

        Map<String, Integer> romanToArabic = Map.of(
                "I", 1,
                "V", 5,
                "X", 10,
                "L", 50,
                "C", 100,
                "D", 500,
                "M", 1000
        );

        if (!romanNumsIsValid(roman)) throw new RuntimeException(exception);
        int result;
        //получаем 1 символ римского числа в арабской нотации
        result = romanToArabic.get(Character.toString(roman.charAt(0)));

        List<Integer> arabs = roman.chars() //создаем массив символов char
                .mapToObj(Character::toString) // приводим char к строке
                .map(romanToArabic::get) // получаем по ключу римской цифры арабскую запись
                .toList(); // создаем список арабских значений

        for (int i = 0; i < arabs.size() - 1; i++) {
            //если предыдущее арабское число больше или равно след.
            if (arabs.get(i) >= arabs.get(i+1)) result+= arabs.get(i +1); // прибавляем след. к конечному результату
            //если меньше
            if (arabs.get(i) < arabs.get(i+1)) {
                //IX 1
                result += arabs.get(i+1) - arabs.get(i) * 2;
            }
        }

        return result;
    }

    private static boolean romanNumsIsValid(String input) {
        return Pattern.matches("[IVXLCDM]+", input);
    }
}