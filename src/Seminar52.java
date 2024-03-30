//проверить изоморфны ли строки
import java.util.HashMap;
import java.util.Map;
public class Seminar52 {



        public static void main(String[] args) {
//            System.out.println(isIsomorph("adad", "eggg"));
//            System.out.println(isIsomorph("add", "egg"));
//            System.out.println(isIsomorph("adad", "egeg"));
//            System.out.println(isIsomorph("kick", "side"));
            System.out.println(isIsomorph("kick", "sids"));
//Изоморфная строка - это повторение вершин (вхождений/символов) одинаковое количество раз и на одинаковых позициях
        }

        // add - egg
        private static boolean isIsomorph(String a, String b) {
            Map<Character, Character> pairs = new HashMap<>();

            if (a.length() != b.length()) return false;

            for (int i = 0; i < a.length(); i++) {
                char key = a.charAt(i);
                char value = b.charAt(i);

                if (pairs.containsKey(key)) {
                    if (pairs.get(key) != value) return false;
                } else {
                    pairs.put(key, value);
                }
            }
            return true;
        }
    }

