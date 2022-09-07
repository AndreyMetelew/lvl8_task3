package task;

/* 3. Одинаковые имя и фамилия

Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию. */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class sameNameAndSurname {
    sameNameAndSurname () {
        System.out.println();
        System.out.println("""
                Задание №3: Нужно создать словарь (Map<String, String>)
                и занести в него десять записей по принципу «Фамилия» - «Имя».
                После этого нужно проверить, сколько людей
                имеют совпадающие с заданным имя или фамилию.""");
        System.out.println();

        Map<String,String> map = new HashMap<>();
        System.out.println("Хранилище типа Map<String, String> создано.");
        System.out.println();

        map.put("Симонов", "Илья");
        map.put("Симонов", "Демид");
        map.put("Ватрушин", "Игорь");
        map.put("Голиманов", "Дмитрий");
        map.put("Симонов", "Пётр");
        map.put("Демидов", "Пётр");
        map.put("Плотников", "Пётр");
        map.put("Симонов", "Виталий");
        map.put("Комаров", "Андрей");
        map.put("Холодов", "Илья");
        System.out.println("Значения добавлены в Map<String, String>.");
        System.out.println();

        String s;
        Scanner scanner = new Scanner (System.in);

        System.out.println("Давайте сосчитаем кол-во совпадающих имён?");
        System.out.print("Введите имя, которое хотите проверить на совпадения: ");
        s = scanner.nextLine();
        System.out.println("Количество совпадений: " + countTheSameFirstName(map,s));
        System.out.println();

        System.out.println("Давайте сосчитаем кол-во совпадающих фамилий?");
        System.out.print("Введите фамилию, которую хотите проверить на совпадения: ");
        s = scanner.nextLine();
        System.out.println("Количество совпадений: " + countTheSameLastName(map,s));
        // В Map не может содержаться две пары с одинаковыми ключами - в данном случае, ключи - это фамилии.
    }

    public static int countTheSameFirstName(Map<String, String> map, String firstName) {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getValue().equals(firstName)) {
                count++;
            }
        }
        return count;
    }

    public static int countTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getKey().equals(lastName)) {
                count++;
            }
        }
        return count;
    }
}