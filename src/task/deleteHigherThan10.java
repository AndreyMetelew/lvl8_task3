package task;

/* 2. Удалить все числа больше 10

Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10. */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class deleteHigherThan10 {
    deleteHigherThan10 () {
        System.out.println();
        System.out.println("""
                Задание №2: Нужно создать множество чисел(Set<Integer>)
                и занести туда 20 различных чисел.
                Из множества чисел нужно удалить все числа больше 10.""");
        System.out.println();

        Set<Integer> integerSet = new HashSet<>();
        Iterator<Integer> iterator = integerSet.iterator();
        System.out.println("Хранилище чисел типа Set<Integer> создано.");
        System.out.println();

        for (int i = 0; i < 20; i++)
            integerSet.add(i + 1);
        System.out.println("Числа добавлены в Set<Integer>.");
        System.out.println();

        while (iterator.hasNext())
            if (iterator.next() > 10)
                iterator.remove();
        System.out.println("Числа больше 10 удалены.");
    }
}