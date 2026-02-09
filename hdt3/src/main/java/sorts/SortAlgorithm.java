package sorts;

public interface SortAlgorithm {

    /**
     * Ordena el arreglo usando el algoritmo correspondiente
     * @param array arreglo de enteros a ordenar
     */
    void sort(int[] array);

    /**
     * Nombre del algoritmo
     * @return nombre del algoritmo
     */
    String getName();
}