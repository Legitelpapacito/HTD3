import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int n = 3000; // Tamaño del arreglo a ordenar
        Random random = new Random();

        // Arreglo base
        int[] baseArray = new int[n];
        for (int i = 0; i < n; i++) {
            baseArray[i] = random.nextInt(3001);
        }

        int[] radixArray = Arrays.copyOf(baseArray, baseArray.length);
        Integer[] selectionArray = new Integer[n];

        for (int i = 0; i < n; i++) {
            selectionArray[i] = baseArray[i];
        }

        // ---------------- RADIX SORT ----------------
        long startRadix = System.nanoTime();
        RadixSort.sort(radixArray);
        long endRadix = System.nanoTime();

        long timeRadix = endRadix - startRadix;

        // ---------------- SELECTION SORT ----------------
        long startSelection = System.nanoTime();
        SelectionSort.sort(selectionArray);
        long endSelection = System.nanoTime();

        long timeSelection = endSelection - startSelection;

        // ---------------- GNOME SORT ----------------

        // ---------------- MERGE SORT ----------------

        // ---------------- QUICK SORT ----------------

        // ---------------- RESULTADOS ----------------
        System.out.println("Resultados con n = " + n);
        System.out.println("Radix Sort (ms): " + timeRadix );
        System.out.println("Selection Sort (ms): " + timeSelection );


    }
}
