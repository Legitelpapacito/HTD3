package sorts;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GnomeSortTest {

    @Test
    void testGnomeSort() {
        int[] arr = {5, 3, 2, 4, 1};
        GnomeSort.sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }
}


