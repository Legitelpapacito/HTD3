package sorts;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class GnomeSortTest {

    @Test
    void testGnomeSort() {
    Integer[] input = {5, 3, 8, 1, 2};
    Integer[] expected = {1, 2, 3, 5, 8};

    GnomeSort<Integer> sorter = new GnomeSort<>();
    sorter.sort(input);

    assertArrayEquals(expected, input);
}
}


