package sorts;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class QuickSortTest {

    @Test
    void testQuickSortOrdenaCorrectamente() {
        Integer[] input = {7, 3, 5, 8, 2};
        Integer[] expected = {2, 3, 5, 7, 8};

        QuickSort<Integer> sorter = new QuickSort<>();
        sorter.sort(input);

        assertArrayEquals(expected, input);
    }
}

