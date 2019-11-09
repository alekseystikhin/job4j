package ru.job4j.comparator;

import java.util.Comparator;


public class ListCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int l1 = left.length();
        int l2 = right.length();
        int lim = Math.min(l1, l2);
        for (int i = 0; i < lim; i++) {
            int leftChar = left.charAt(i);
            int rightChar = right.charAt(i);
            if (leftChar != rightChar) {
                return leftChar - rightChar;
            }
        }

        if (l1 != l2) {
            return l1 - l2;
        } else {
            return 0;
        }
    }
}