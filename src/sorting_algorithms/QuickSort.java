package sorting_algorithms;

import java.util.Arrays;
import java.util.Date;

public class QuickSort {

        int partition(int array[], int low, int high) {

            int pivot = array[high];

            int i = (low - 1);

            // Put the elements smaller than pivot on the left and
            // greater than pivot on the right of pivot
            for (int j = low; j < high; j++) {

                // compare all elements with pivot
                // swap the element greater than pivot
                // with element smaller than pivot
                // to sort in descending order
                // if (array[j] >= pivot)
                if (array[j] <= pivot) {

                    // increase the second pointer if
                    // smaller element is swapped with greater
                    i++;
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

            // put pivot in position
            // so that element on left are smaller
            // element on right are greater than pivot
            int temp = array[i + 1];
            array[i + 1] = array[high];
            array[high] = temp;
            return (i + 1);
        }

        void quickSort(int array[], int low, int high) {
            if (low < high) {

                int pivot = partition(array, low, high);

                // sort the elements on the left of the pivot
                quickSort(array, low, pivot - 1);

                // sort the elements on the right of pivot
                quickSort(array, pivot + 1, high);
            }
        }

/*
         public static void main(String args[]) {

            int[] data = { 8, 7, 2, 1, 0, 9, 6 };
            int size = data.length;

            QuickSort qs = new QuickSort();

            qs.quickSort(data, 0, size - 1);
            System.out.println("Sorted Array: ");
            System.out.println(Arrays.toString(data));
        }
*/


    public static void main(String[] args) {
        System.out.println(new QuickSort().getValue());
    }

        public synchronized int getValue()
        {
            System.out.println("In get Value");
            System.out.println(new Date());
            getIntValue();
            System.out.println(new Date());
            return 0;
        }

        public void getIntValue()
        {
            for(int i=1;i<10000000;i++)
            {
                System.out.println("i-->"+i);
            }
        }
    }

