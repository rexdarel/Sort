import java.util.Arrays;

public class Sort {

    public static void main(String[] args){
        int[] array = {1,23,3,32,56,};

        BubbleSort bS = new BubbleSort();
        SelectionSort sS = new SelectionSort();
        InsertionSort iS = new InsertionSort();

        System.out.println("Bubble Sort: " + Arrays.toString(bS.bubbleSort(array)));
        System.out.println("Selection Sort: " + Arrays.toString(sS.selectionSort(array)));
        System.out.println("Insertion Sort: " + Arrays.toString(iS.insertionSort(array)));
    }
}
