package org.wolroys;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Task 1

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

        Map<String, Integer> map = new HashMap<>();
        for (String word : array)
            map.put(word, map.getOrDefault(word, 0) + 1);

        for (Map.Entry<String, Integer> entry : map.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());
    }
}