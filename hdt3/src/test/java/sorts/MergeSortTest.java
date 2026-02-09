package sorts;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class MergeSortTest {

    @Test
    void testMergeSortOrdenaCorrectamente() {
        Integer[] input = {9, 4, 6, 2, 1};
        Integer[] expected = {1, 2, 4, 6, 9};

        MergeSort<Integer>sorter = new MergeSort<>();
        sorter.sort(input);

        assertArrayEquals(expected, input);
    }
}
