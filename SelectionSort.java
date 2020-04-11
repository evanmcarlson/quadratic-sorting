public class SelectionSort implements SortingAlgorithm {

    void swap(int[]a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    int smallest(int[]a, int start) {
        int smallest = start;
        for (int i = start + 1; i < a.length; i++) {
            if(a[i] < a[smallest]) {
                smallest = i;
            }
        }
        return smallest;
    }

    public void sort(int[]a) {
        for(int i = 0; i < a.length; i++) {
            swap(a, i, smallest(a, i));
        }
    }


}
