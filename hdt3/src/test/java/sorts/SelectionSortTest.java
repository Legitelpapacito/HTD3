package edu.uvg.htd3;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

import edu.uvg.htd3.sorts.SelectionSort;

public class SelectionSortTest {

    @Test
    void ordenaCorrectamente() {
        Integer[] datos = {5, 3, 1, 4, 2};

        SelectionSort.sort(datos);

        assertArrayEquals(
            new Integer[]{1, 2, 3, 4, 5},
            datos
        );
    }
}
