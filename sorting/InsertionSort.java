package sorting;

public class InsertionSort implements Sorter {

    public void sort(int[] input) {
        System.out.println("Insertion Sort!!!");
        int n = input.length();
        for (int i = 1, i < n; i++) {
            int key = input[i];
            int j = i-1;

            while (j >= 0 && input[j] > key) {
                input[j+1] = input[j];
            }
        }
    }
}



