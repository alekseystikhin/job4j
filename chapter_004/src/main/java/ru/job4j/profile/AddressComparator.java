package ru.job4j.profile;

import java.util.Comparator;

public class AddressComparator implements Comparator<Address> {
    @Override
    public int compare(Address o1, Address o2) {
        return o1.getCity().toUpperCase().compareTo(o2.getCity().toUpperCase());
    }
}
