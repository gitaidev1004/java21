package com.example.app3;
import java.util.*;

public class OrderedMapExample {
    public static void main(String[] args) {
        Map<String, Integer> linkedMap = new LinkedHashMap<>();
        linkedMap.put("C", 3);
        linkedMap.put("A", 1);
        linkedMap.put("B", 2);
        System.out.println("LinkedHashMap: " + linkedMap);
        Map<String, Integer> treeMap = new TreeMap<>(linkedMap);
        System.out.println("TreeMap(정렬됨): " + treeMap);
    }
}