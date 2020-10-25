package main.java.Algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sort {

    public static void main(String[] args) {
        String y = "y";
        Scanner in = new Scanner(System.in);
        while ("y".equalsIgnoreCase(y)) {
            int[] a = IntStream
                    .range(1, 10000)
                    .toArray();
            List<Integer> aList = Arrays
                    .stream(a)
                    .boxed()
                    .collect(Collectors.toList());
            Collections.shuffle(aList);
            a = aList
                    .stream()
                    .mapToInt(i -> i)
                    .toArray();
            System.out.println("Un sorted array");
            System.out.println("===================");
            printArray(a);
            sortArray(a, in);
            System.out.println("Sorted array");
            System.out.println("===================");
            printArray(a);
            System.out.println("Do you want to continue y/n");
            if (in.hasNext()){
                y = in.next();
            } else {
                System.exit(0);
            }
        }
    }

    private static void sortArray(int[] a, Scanner in) {
        System.out.println("Select any of the below sorting logic");
        System.out.println("1.Selection sort\n"+"2.Bubble sort\n"+"3.Insertion sort");
        int input = in.nextInt();

        switch (input) {
            case 1 : new SelectionSort().sort(a); break;
            case 2 : new BubbleSort().sort(a); break;
            case 3 : new InsertionSort().sort(a); break;
            default:
                System.out.println("No such option, select valid one");
        }
    }

    private static void printArray(int[] a) {
        Arrays.stream(a).forEach(e -> System.out.print(e + ","));
        System.out.println("\n");
    }
}
