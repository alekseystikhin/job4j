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
}
