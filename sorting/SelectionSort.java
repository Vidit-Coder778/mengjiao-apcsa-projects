package sorting;

public class SelectionSort implements Sorter {

    public void sort(int[] input) {
        System.out.println("Selection Sort!!!");
        int n = input.length();
        for (int i = 0; i < n; i++) {

            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (input[j] < input[minIdx]) {
                    minIdx = j;
                }
            }

            int temp = input[minIdx];
            input[minIdx] = input[i];
            input[i] = temp;

        }
    }
}
