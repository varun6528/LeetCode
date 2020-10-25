package main.java.Algorithm;

import java.util.Arrays;

public class InsertionSort {
    public void sort(int[] a) {
        System.out.println("\nInsertion Sort");
        System.out.println("===================");
        sortArray(a);
    }
    private void sortArray(int[] a) {
        long startTime = System.currentTimeMillis();
        int n = a.length;
        for(int i=1; i<n; i++) {
            int first = a[i];
            int j = i -1;
            while(j>=0 && a[j] > first) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = first;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("\nTime to sort" + "\n" + (endTime - startTime) + "ms");
    }
}
