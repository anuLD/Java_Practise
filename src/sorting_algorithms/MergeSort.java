package sorting_algorithms;

import com.sun.scenario.effect.Merge;

import java.util.Arrays;
public class MergeSort {
        // Merge two sub arrays L and M into array
        void merge(int array[], int left, int mid, int right) {

            int leftSubArrayLength = mid - left + 1;
            int rightSubArrayLength = right - mid;

            int L[] = new int[leftSubArrayLength];
            int M[] = new int[rightSubArrayLength];

            // fill the left and right array
            for (int i = 0; i < leftSubArrayLength; i++)
                L[i] = array[left + i];
            for (int j = 0; j < rightSubArrayLength; j++)
                M[j] = array[mid + 1 + j];

            // Maintain current index of sub-arrays and main array
            int i, j, k;
            i = 0;
            j = 0;
            k = left;

            // Until we reach either end of either L or M, pick larger among
            // elements L and M and place them in the correct position at A[p..r]
            // for sorting in descending
            // use if(L[i] >= <[j])
            while (i < leftSubArrayLength && j < rightSubArrayLength) {
                if (L[i] <= M[j]) {
                    array[k] = L[i];
                    i++;
                } else {
                    array[k] = M[j];
                    j++;
                }
                k++;
            }

            // When we run out of elements in either L or M,
            // pick up the remaining elements and put in A[p..r]
            while (i < leftSubArrayLength) {
                array[k] = L[i];
                i++;
                k++;
            }

            while (j < rightSubArrayLength) {
                array[k] = M[j];
                j++;
                k++;
            }
        }

        void mergeSort(int array[], int left, int right) {
            if (left < right) {
                int mid = (left + right) / 2;
                mergeSort(array, left, mid);
                mergeSort(array, mid + 1, right);
                merge(array, left, mid, right);
            }
        }

        public static void main(String args[]) {
            int[] array = { 6, 5, 12, 10, 9, 1 };
            MergeSort obj = new MergeSort();
            obj.mergeSort(array, 0, array.length - 1);
            System.out.println("Sorted Array:");
            System.out.println(Arrays.toString(array));
        }


}
