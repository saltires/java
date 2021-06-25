package com.smap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("a", "97");
        map.put("b", "98");
        map.put("b", "96");

        // map.remove("a");
        // map.clear();
        // System.out.println(map.containsKey("c"));
        // System.out.println(map.isEmpty());

        // System.out.println(map);
        // System.out.println(map.size());

        // System.out.println(map.get("d"));
        // Set<String> se = map.keySet();
        //
        // for (String i : se) {
        //     System.out.println(i);
        // }

        // Collection<String> values = map.values();
        //
        // for (String i : values) {
        //     System.out.println(i);
        // }

        // Set<String> se = map.keySet();
        //
        // for (String s : se) {
        //     String value = map.get(s);
        //     System.out.println(value);
        // }

        map.entrySet();
        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (Map.Entry<String, String> e : entries) {
            String key = e.getKey();
            String value = e.getValue();

            System.out.println(key);
            System.out.println(value);
        }
    }
}
