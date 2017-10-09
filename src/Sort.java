import java.awt.*;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Sort {

    public static void main(String[] args) throws IOException {

        int array[] = new int[15000];
        int i = 0;
        FileInputStream fstream = new FileInputStream("random15000.txt");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String data;
        while ((data = br.readLine()) != null)   {
            String[] tmp = data.split(" ");    //Split space
            for(String s: tmp)
                array[i++] = Integer.parseInt(s);
        }

        BubbleSort bS = new BubbleSort();
        SelectionSort sS = new SelectionSort();
        InsertionSort iS = new InsertionSort();
        MergeSort mS = new MergeSort();

        long startTimeBS = System.nanoTime();
        bS.bubbleSort(array);
        long endTimeBS = System.nanoTime();
        long totalTimeBS = endTimeBS - startTimeBS;

        long startTimeSS = System.nanoTime();
        sS.selectionSort(array);
        long endTimeSS = System.nanoTime();
        long totalTimeSS = endTimeSS - startTimeSS;

        long startTimeIS = System.nanoTime();
        iS.insertionSort(array);
        long endTimeIS = System.nanoTime();
        long totalTimeIS = endTimeIS - startTimeIS;

        long startTimeMS = System.nanoTime();
        mS.sort(array, 0, array.length - 1);
        long endTimeMS = System.nanoTime();
        long totalTimeMS = endTimeMS - startTimeMS;

        System.out.println("Running time of Bubble Sort: " + totalTimeBS);
        System.out.println("Running time of Selection Sort: " + totalTimeSS);
        System.out.println("Running time of Insertion Sort: " + totalTimeIS);
        System.out.println("Running time of Merge Sort: " + totalTimeMS);
    }
}
