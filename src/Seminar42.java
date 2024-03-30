import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Seminar42 {
    private static final List<String> strings = new LinkedList<>();
    public static void main(String[] args) {

        while (true) {
            System.out.println("============================");
            String in = getUserEnter();
            String text = in.split(":")[0];

            int position = Integer.parseInt(in.split(":")[1]);

            if (position > strings.size()) {
                for (int i = 0; i < position; i++) {
                    strings.add(null);
                }
                add(position, text);
            } else {
                if (!text.toLowerCase().startsWith("print")) {
                    add(position, text);
                } else {
                    System.out.println("TEXT: " + strings.get(position));
                    strings.remove(strings.get(position));
                    System.out.println("This text deleted");
                }
            }

        }
    }

    private static void add(int position, String text) {
        strings.add(position, text);
        System.out.println("Text saved!");
    }

    private static String getUserEnter() {
        System.out.println("To save text \n enter an expression like text:num,\n where text is any text, : is delimiter and num is the save position: ");
        System.out.println("To read the text \n, enter a line like print:num, where num is the position at which the text is saved: ");
        System.out.println("Enter q to quit");
        String text = prompt();

        if (text.equalsIgnoreCase("q") ) {
            System.exit(0);
        } else {
            if (!text.contains(":")) {
                throw new RuntimeException("Input error");
            }
        }
        return text;
    }

    private static String prompt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
    }

