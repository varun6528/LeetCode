package main.java.Algorithm;

import java.time.Instant;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {21,11,15,43,36,35,25,1,82};
        System.out.println("Start");
        long startTime = System.currentTimeMillis();

        sortArray(a);
        printArray(a);
        long endTime = System.currentTimeMillis();
        System.out.println("\n" + (endTime - startTime) + "ms");
    }

    private static void printArray(int[] a) {
        System.out.println("Sorted Array");
        Arrays.stream(a).forEach(e -> System.out.print(e + " "));
    }

    private static void sortArray(int[] a) {
        for(int i=0; i<a.length -1; i++) {
            int minIndex = i;
            for(int j=i+1; j<a.length -1; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
    }
}
