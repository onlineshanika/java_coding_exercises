package com.techreturners.exercise003;

import java.util.*;
import java.util.stream.Collectors;

public class Exercise003 {

    private static final Map<String, Integer> iceCreamMap = new HashMap<String, Integer>() {
        {
            put("Pistachio", 0);
            put("Raspberry Ripple", 1);
            put("Vanilla", 2);
            put("Mint Chocolate Chip", 3);
            put("Chocolate", 4);
            put("Mango Sorbet", 5);
        }
    };

    int getIceCreamCode(String iceCreamFlavour) {
        Integer mapValue = iceCreamMap.get(iceCreamFlavour);
        return mapValue != null ? mapValue : -1;
    }

    String[] iceCreamFlavours() {
        Map<String, Integer> sortedMap = iceCreamMap.entrySet().
                stream().
                sorted(Map.Entry.comparingByValue()).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        return sortedMap.keySet().toArray(new String[0]);
    }

}
