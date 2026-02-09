package sorts;

public interface SortAlgorithm<T extends Comparable<T>> {

    void sort(T[] array);

    String getName();
}
