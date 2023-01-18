package com.techreturners.exercise005;

import java.util.Arrays;
import java.util.List;

public class Exercise005 {

    private static final String PATTERN = "[^\\x00-\\x7F]+";
    public boolean isPangram(String input) {
        Boolean[] alphaArray = new Boolean[26];
        int index = 0;

        if (input == null || input.length() < 26 || containsASCIICharacters(input)) {
            return false;
        } else {
            input = input.toUpperCase();
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
                    index = input.charAt(i) - 'A';
                }
                alphaArray[index] = Boolean.TRUE;
            }
            List<Boolean> alphaList = Arrays.asList(alphaArray);
            return !(alphaList.contains(null));
        }
    }

    private boolean containsASCIICharacters(String input) {
        return input.matches(PATTERN);
    }
}
