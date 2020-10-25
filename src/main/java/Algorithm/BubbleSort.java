package main.java.Algorithm;


public class BubbleSort {

    public void sort(int[] a) {
        System.out.println("Bubble Sort");
        System.out.println("===================");
        sortArray(a);
    }

    private void sortArray(int[] a) {
        long startTime = System.currentTimeMillis();
        int n = a.length;
        for(int i=0; i<n -1; i++) {
            for(int j=0; j<n-i-1; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }

        }
        long endTime = System.currentTimeMillis();
        System.out.println("\nTime to sort" + "\n" + (endTime - startTime) + "ms");
    }
}
