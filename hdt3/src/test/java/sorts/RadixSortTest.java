package hdt3.src.test.java.sorts;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RadixSortTest {

    @Test
    void pruebaOrdenamiento() {
        int[] datos = {170, 45, 75, 90, 802};

        RadixSort.sort(datos);

        assertArrayEquals(
            new int[]{45, 75, 90, 170, 802},
            datos
        );
    }
}
