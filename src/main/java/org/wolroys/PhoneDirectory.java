package org.wolroys;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneDirectory {
    private static Map<String, Set<String>> list;

    static {
        list = new HashMap<>();
    }

    public static void add(String surname, String phoneNumber) {
        list.computeIfAbsent(surname, key -> new HashSet<>()).add(phoneNumber);
    }

    public static Set<String> get(String surname) {
        return list.getOrDefault(surname, new HashSet<>());
    }

    public static void printList(){
        for (var person : list.entrySet())
            System.out.println(person);
    }
}
