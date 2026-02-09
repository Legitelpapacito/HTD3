package edu.uvg.htd3;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

import edu.uvg.htd3.sorts.RadixSort;

public class RadixSortTest {

    @Test
    void ordenaCorrectamente() {
        int[] datos = {170, 45, 75, 90, 802};

        RadixSort.sort(datos);

        assertArrayEquals(
            new int[]{45, 75, 90, 170, 802},
            datos
        );
    }
}
