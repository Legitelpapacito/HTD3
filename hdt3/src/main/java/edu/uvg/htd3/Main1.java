package hdt3.src.main.java.edu.uvg.htd3;
import java.util.Arrays;
import java.util.Random;

import hdt3.src.main.java.sorts.RadixSort;
import hdt3.src.main.java.sorts.SelectionSort;
import hdt3.src.main.java.sorts.GnomeSort;


public class Main1 {

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

        int[] gnomeArray = Arrays.copyOf(baseArray, baseArray.length);


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
        long startGnome = System.nanoTime();
        GnomeSort.sort(gnomeArray);
        long endGnome = System.nanoTime();

        long timeGnome = endGnome - startGnome;

        // ---------------- MERGE SORT ----------------

        // ---------------- QUICK SORT ----------------

        // ---------------- RESULTADOS ----------------
        System.out.println("Resultados con n = " + n);
        System.out.println("Radix Sort (ms): " + timeRadix );
        System.out.println("Selection Sort (ms): " + timeSelection );
        System.out.println("Gnome Sort (ms): " + timeGnome );

    }
}
