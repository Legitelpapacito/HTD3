package edu.uvg.htd3;

import java.util.Arrays;
import java.util.Random;

import sorts.GnomeSort;
import sorts.MergeSort;
import sorts.QuickSort;
import sorts.RadixSort;
import sorts.SelectionSort;


public class Main1 {

    public static void main(String[] args) {

        int n = 3000;
        Random random = new Random();

        // Arreglo base
        int[] baseArray = new int[n];
        for (int i = 0; i < n; i++) {
            baseArray[i] = random.nextInt(3001);
        }

        int[] radixArray = Arrays.copyOf(baseArray, baseArray.length);
        Integer[] selectionArray = new Integer[n];
        Integer[] mergeArray = new Integer[n];
        Integer[] quickArray = new Integer[n];
        Integer[] gnomeArray = new Integer[n];

        for (int i = 0; i < n; i++) {
            selectionArray[i] = baseArray[i];
            mergeArray[i] = baseArray[i];
            quickArray[i] = baseArray[i];
        }

        for (int i = 0; i < n; i++) {
        gnomeArray[i] = baseArray[i];
        }

        // RADIX
        long startRadix = System.nanoTime();
        RadixSort.sort(radixArray);
        long timeRadix = System.nanoTime() - startRadix;

        // SELECTION
        long startSelection = System.nanoTime();
        SelectionSort.sort(selectionArray);
        long timeSelection = System.nanoTime() - startSelection;

        // GNOME
        GnomeSort<Integer> gnomeSort = new GnomeSort<>();
        long startGnome = System.nanoTime();
        gnomeSort.sort(gnomeArray);
        long timeGnome = System.nanoTime() - startGnome;

        // MERGE
        MergeSort<Integer> mergeSort = new MergeSort<>();
        long startMerge = System.nanoTime();
        mergeSort.sort(mergeArray);
        long timeMerge = System.nanoTime() - startMerge;

        // QUICK
        QuickSort<Integer> quickSort = new QuickSort<>();
        long startQuick = System.nanoTime();
        quickSort.sort(quickArray);
        long timeQuick = System.nanoTime() - startQuick;

        // RESULTADOS
        System.out.println("Resultados con n = " + n);
        System.out.println("Radix Sort (ns): " + timeRadix );
        System.out.println("Selection Sort (ns): " + timeSelection );
        System.out.println("Gnome Sort (ns): " + timeGnome );
        System.out.println("Merge Sort (ns): " + timeMerge );
        System.out.println("Quick Sort (ns): " + timeQuick );
    }
}
