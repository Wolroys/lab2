package org.wolroys;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Task 1

        System.out.println("---- 1 Task ----");
        String[] array = {
                "dog",
                "cat",
                "bird",
                "phone",
                "dog",
                "plane",
                "spoon",
                "car",
                "cat",
                "bird",
                "god",
                "dog",
                "car",
                "bicycle",
                "cat",
                "phone"
        };

        //List<String> uniqueWords = Arrays.stream(array).distinct().toList(); Здесь выполнено через стримы

        Set<String> uniqueWords = new HashSet<>(Arrays.asList(array));

        System.out.println("Список уникальных слов: ");
        System.out.println(uniqueWords);

        System.out.println("Количество вхождений каждого слова: ");
        Map<String, Integer> map = new HashMap<>();
        for (String word : array)
            map.put(word, map.getOrDefault(word, 0) + 1);

        for (Map.Entry<String, Integer> entry : map.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());


        System.out.println("---- 2 Task ----");

        PhoneDirectory.add("Paslenov", "8-800-555-35-35");
        PhoneDirectory.add("Paslenov", "8-888-888-88-88");
        PhoneDirectory.add("Petrov", "8-888-888-88-82");
        PhoneDirectory.add("Ivanov", "8-488-858-88-82");
        PhoneDirectory.add("Ivanov", "8-488-898-88-82");
        PhoneDirectory.add("Ivanov", "8-488-898-88-82");

        System.out.println("Paslenov: " + PhoneDirectory.get("Paslenov"));
        System.out.println("Petrov: " + PhoneDirectory.get("Petrov"));
        System.out.println("Ivanov: " + PhoneDirectory.get("Ivanov"));

//        PhoneDirectory.printList(); //напечатать все номера
    }

}