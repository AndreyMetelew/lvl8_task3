package task;

/* 5. Удалить людей, имеющих одинаковые имена

Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена. */

import java.util.*;

public class deleteSameNames {
    deleteSameNames () {
        System.out.println();
        System.out.println("""
                Задание №5: Нужно создать словарь (Map<String, String>)
                и занести в него десять записей по принципу «фамилия» - «имя».
                После этого, надо удалить всех людей, имеющих одинаковые имена.""");
        System.out.println();

        Map<String, String> map = new HashMap<>(createMap());
        getMapValues(map);

        System.out.println("Проверяем имена на совпадения...");
        removeTheFirstNameDuplicates(map);
        System.out.println("Проверка завершена.\n");
        getMapValues(map);
    }

    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<>();
        System.out.println("Хранилище типа Map<String, String> создано.\n");
        map.put("Симонов", "Илья");
        map.put("Ватрушин", "Виктор");
        map.put("Демидов", "Илья");
        map.put("Петров", "Пётр");
        map.put("Семёнов", "Сергей");
        map.put("Ильин", "Илья");
        map.put("Ульянов", "Пётр");
        map.put("Иванов", "Илья");
        map.put("Григоренко", "Илья");
        map.put("Коновалов", "Ибрагим");
        System.out.println("Значения добавлены в Map<String, String>.\n");
        return map;
    }

    public static void getMapValues (Map<String, String> map) {
        System.out.println("Список такой:");
        for (Map.Entry<String, String> pair: map.entrySet())
            System.out.println(pair.getKey() + " " + pair.getValue());
        System.out.println();
    }

    public static void removeTheFirstNameDuplicates(Map <String,String> map){
        HashMap<String, String> copy1 = new HashMap<>(map);
        HashMap<String, String> copy2 = new HashMap<>(map);
        for (Map.Entry<String, String> pair1: copy1.entrySet())
        {
            int count = 0;
            for (Map.Entry<String, String> pair2: copy2.entrySet()) {
                if (pair1.getValue().equals(pair2.getValue())) {
                    count++;
                }
            }
            if (count > 1) {
                removeItemFromMapByValue(map, pair1.getValue());
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String,String> map, String value){
        HashMap<String,String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair: copy.entrySet()){
            if (pair.getValue().equals(value)){
                map.remove(pair.getKey());
            }
        }
    }
}
