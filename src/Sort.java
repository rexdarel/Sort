import java.awt.*;
import java.io.*;
import java.util.Arrays;

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
        HeapSort hS = new HeapSort();
        QuickSort qS = new QuickSort();

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

        long startTimeHS = System.nanoTime();
        hS.sort(array);
        long endTimeHS = System.nanoTime();
        long totalTimeHS = endTimeHS - startTimeHS;

        long startTimeQS = System.nanoTime();
        qS.sort(array, 0, 500);
        long endTimeQS = System.nanoTime();
        long totalTimeQS = endTimeQS - startTimeQS;

        System.out.println("Running time of Bubble Sort: " + totalTimeBS);
        System.out.println("Running time of Selection Sort: " + totalTimeSS);
        System.out.println("Running time of Insertion Sort: " + totalTimeIS);
        System.out.println("Running time of Merge Sort: " + totalTimeMS);
        System.out.println("Running time of Heap Sort: " + totalTimeHS);
        System.out.println("Running time of Quick Sort: " + totalTimeQS);
    }
}
