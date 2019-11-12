package ru.job4j.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortDepartments {

    public void ascSort(List<String> orgs) {
        Collections.sort(orgs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }

    public void descSort(List<String> orgs) {
        Collections.sort(orgs, new Comparator<String>() {
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
    }

    public void fillGaps(List<String> orgs) {
        List<String> tempList = new ArrayList<>();
        tempList.addAll(orgs);
        for (String dept : tempList) {
            while (dept.contains("\\")) {
                dept = dept.substring(0, dept.lastIndexOf("\\"));
                if (!orgs.contains(dept)) {
                    orgs.add(dept);
                }
            }

        }
    }

    public static void main(String[] args) {
        SortDepartments sortDepartments = new SortDepartments();
        List<String> orgs = new ArrayList<>();
        orgs.add("K1\\SK1");
        orgs.add("K1\\SK2");
        orgs.add("K1\\SK1\\SSK1");
        orgs.add("K1\\SK1\\SSK2");
        orgs.add("K2");
        orgs.add("K2\\SK1\\SSK1");
        orgs.add("K2\\SK1\\SSK2");
        sortDepartments.fillGaps(orgs);
        for (String s : orgs) {
            System.out.println(s);
        }
        System.out.println("-----------------------");
        sortDepartments.ascSort(orgs);
        for (String s : orgs) {
            System.out.println(s);
        }
        System.out.println("-----------------------");
        sortDepartments.descSort(orgs);
        for (String s : orgs) {
            System.out.println(s);
        }
    }
}
