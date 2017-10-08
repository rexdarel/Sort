public class InsertionSort {
    public int[] insertionSort(int[] array){
        for (int i = 1; i < array.length; i++){
            int index = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > index){
                array[j] = array[j - 1];
                j--;
            }
            array[j] = index;
        }
        return array;
    }
}
