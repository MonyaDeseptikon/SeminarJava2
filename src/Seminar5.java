/*Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
        123456 Иванов
321456 Васильев
234561 Петрова
234432 Иванов
654321 Петрова
345678 Иванов
Вывести данные по сотрудникам с фамилией Иванов.*/

import java.util.Map;
import java.util.TreeMap;

public class Seminar5 {

        public class Task0 {
            public static void main(String[] args) {
                Map<Integer, String> passNumToName = new TreeMap<>();
                passNumToName.put(123456, "Иванов");
                passNumToName.put(321456, "Васильев");
                passNumToName.put(234561, "Петрова");
                passNumToName.put(234432, "Иванов");
                passNumToName.put(654321, "Петрова");
                passNumToName.put(345678, "Иванов");
//        Map<Integer, String> map = Map.of(123456, "Иванов", 321456, "Васильев"); НЕИЗМЕНЯЕМО
                System.out.println(passNumToName);

                for (Map.Entry<Integer, String> entry : passNumToName.entrySet()) {
                    if (entry.getValue().equals("Иванов")) System.out.println(entry);
                }

//        List<Map.Entry<Integer, String>> ivanovs = passNumToName.entrySet()
//                .stream()
//                .filter(integerStringEntry -> integerStringEntry.getValue().equals("Иванов"))
//                .toList();

//        System.out.println(ivanovs);

//        map.put(123456, "etwa");

            }
        }
    }

