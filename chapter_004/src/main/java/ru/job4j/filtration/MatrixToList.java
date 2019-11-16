package ru.job4j.filtration;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MatrixToList {
    List<Integer> matrixToList(Integer[][] matrix) {
        return  Stream.of(matrix).flatMap(e -> List.of(e).stream()).collect(Collectors.toList());
    }
}
