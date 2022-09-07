package task;

/* 1. 20 слов на букву «Л»

Создать множество строк (Set<String>), занести в него 20 слов на букву «Л». */

import java.util.HashSet;
import java.util.Set;

public class twelveWords {
    twelveWords () {
        System.out.println();
        System.out.println("""
                Задание №1: Нужно создать множество строк типа Set<String>
                и занести в него 20 слов на букву «Л».""");
        System.out.println();

        Set<String> stringSet = new HashSet<String>();
        System.out.println("Строки типа Set<String> созданы.");
        System.out.println();

        stringSet.add("Ликёр");
        stringSet.add("Лейка");
        stringSet.add("Лук");
        stringSet.add("Лама");
        stringSet.add("Луна");
        stringSet.add("Лошадь");
        stringSet.add("Лимон");
        stringSet.add("Лифт");
        stringSet.add("Лоб");
        stringSet.add("Ливер");
        stringSet.add("Лучник");
        stringSet.add("Лак");
        stringSet.add("Лампа");
        stringSet.add("Лиходей");
        stringSet.add("Лимит");
        stringSet.add("Лимфа");
        stringSet.add("Лицо");
        stringSet.add("Лопасть");
        stringSet.add("Лайм");
        stringSet.add("Лом");
        System.out.println("Строки типа Set<String> внесены.");
    }
}