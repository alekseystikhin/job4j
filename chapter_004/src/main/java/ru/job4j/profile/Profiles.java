package ru.job4j.profile;

import java.util.List;
import java.util.stream.Collectors;

public class Profiles {

    List<Address> collect(List<Profile> profiles) {
        return profiles.stream().map(profile -> profile.getAddress()).collect(Collectors.toList());
    }

    List<Address> collectUnique(List<Profile> profiles) {
        return profiles.stream().map(profile -> profile.getAddress()).distinct().sorted(new AddressComparator()).collect(Collectors.toList());
    }
}
