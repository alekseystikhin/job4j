package ru.job4j.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortDepartments {

    public List<String> ascSort(List<String> list) {
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        return list;
    }

    public List<String> descSort(List<String> list) {
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.startsWith(o2)) {
                    return 1;
                } else if (o2.startsWith(o1)) {
                    return -1;
                } else {
                    return o2.compareTo(o1);
                }
            }
        });
        return list;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("K1\\SK1");
        list.add("K1\\SK2");
        list.add("K2\\SK1");
        list.add("K1\\SK1\\SSK1");
        list.add("K1\\SK1\\SSK2");
        list.add("K1");
        list.add("K2");
        list.add("K2\\SK1\\SSK1");
        list.add("K2\\SK1\\SSK2");
        new SortDepartments().ascSort(list);
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-----------------------");
        new SortDepartments().descSort(list);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
