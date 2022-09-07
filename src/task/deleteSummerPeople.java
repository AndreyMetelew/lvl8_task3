package task;

/* 4. Удалить всех людей, родившихся летом

Создать словарь (Map<String, Date>) и занести в него десять записей по принципу:
«фамилия» - «дата рождения». Удалить из словаря всех людей, родившихся летом. */

import java.util.*;

public class deleteSummerPeople {
    deleteSummerPeople () {
        System.out.println();
        System.out.println("""
                Задание №4: Нужно создать словарь (Map<String, Date>)
                и занести в него десять записей по принципу: «фамилия» - «дата рождения».
                Удалить из словаря всех людей, родившихся летом.""");
        System.out.println();

        Map<String,Date> map = new HashMap<>();
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        System.out.println("Хранилище типа Map<String, Date> создано.");
        System.out.println();

        map.put("Симонов Илья", new Date(1995, Calendar.MAY, 31));
        map.put("Симонов Демид", new Date(1994, Calendar.JUNE, 24));
        map.put("Ватрушин Игорь", new Date(1996, Calendar.JULY, 21));
        map.put("Голиманов Дмитрий", new Date(1994, Calendar.AUGUST, 24));
        map.put("Симонов Пётр", new Date(2000, Calendar.JUNE, 2));
        map.put("Демидов Пётр", new Date(2001, Calendar.FEBRUARY, 3));
        map.put("Плотников Пётр", new Date(2000, Calendar.MARCH, 3));
        map.put("Симонов Виталий", new Date(1990, Calendar.AUGUST, 8));
        map.put("Комаров Андрей", new Date(2000, Calendar.SEPTEMBER, 1));
        map.put("Холодов Илья", new Date(2001, Calendar.AUGUST, 31));
        System.out.println("Значения добавлены в Map<String, Date>.");
        System.out.println();

        while (iterator.hasNext()) {
            int month = iterator.next().getValue().getMonth();
            if ((month >= 5) && (month <= 7))
                iterator.remove();
        }
        System.out.println("Данные по людям, родившимся летом, удалены.");
    }
}
