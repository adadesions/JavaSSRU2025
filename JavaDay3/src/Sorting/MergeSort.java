package Sorting;

public class MergeSort {

    public static void mergeSort(int[] data) {
        if (data == null || data.length == 0) {
            return;
        }
        mergeSort(data, 0, data.length - 1);
    }

    private  static  void mergeSort(int[] data, int left, int right){
        if (left >= right) {
            return; //Base Case
        }

        int mid = left + (right - left)/2;

        mergeSort(data, left, mid);
        mergeSort(data, mid + 1, right);

        // Merge the sorted halves
        merge(data, left, mid, right);
    }

    private  static  void merge(int[] data, int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        // copy data
        for (int i = 0; i < n1; i++) {
            L[i] = data[left + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = data[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                data[k] = L[i];
                i++;
            } else {
                data[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            data[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            data[k] = R[j];
            j++;
            k++;
        }
    }
}
