package main.java.Algorithm;

public class SelectionSort {
    public void sort(int[] a) {
        System.out.println("\nSelection Sort");
        System.out.println("===================");
        sortArray(a);
    }

    private void sortArray(int[] a) {
        long startTime = System.currentTimeMillis();
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
        long endTime = System.currentTimeMillis();
        System.out.println("\nTime to sort" + "\n" + (endTime - startTime) + "ms");
    }
}
