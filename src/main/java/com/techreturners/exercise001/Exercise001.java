package com.techreturners.exercise001;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class Exercise001 {

    private static final String LINUX = "Linux";

    public String capitalizeWord(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return String.format("%s.%s", Character.toUpperCase(firstName.charAt(0)),
                Character.toUpperCase(lastName.charAt(0)));
    }

    public double addVat(double originalPrice, double vatRate) {
        double vatAmt = (originalPrice * vatRate) / 100;
        BigDecimal bdVatAmt = new BigDecimal(vatAmt).setScale(2, RoundingMode.HALF_EVEN);
        return originalPrice + bdVatAmt.doubleValue();
    }

    public String reverse(String sentence) {
        char[] chars = sentence.toCharArray();
        StringBuilder reverseOrder = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            reverseOrder.append(chars[i]);
        }
        return reverseOrder.toString();
    }

    public int countLinuxUsers(List<User> users) {
        int linuxCnt = 0;
        for (User user : users) {
            if (user != null && LINUX.equalsIgnoreCase(user.getType())) {
                linuxCnt++;
            }
        }
        return linuxCnt;
    }
}
