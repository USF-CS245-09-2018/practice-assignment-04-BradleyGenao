public class BubbleSort implements SortingAlgorithm {

//    void bubblesort(int[] arr) {
//
//        boolean swapped = true;      //O(1)
//        while (swapped) {         //O(1)
//            swapped = false;
//            for (int i = 0; i < arr.length - 1; i++) {   //O(n)
//                if (arr[i] > arr[i + 1]){                 //O(n)
//                    swap(i, i + 1, arr);            //O(n^2)
//                    swapped = true;                       //O(n^2)
//                }
//            }
//        }
//    }


    void bubblesort(int[] arr) {

        for (int k = 0; k < arr.length - 1; k++) {  //O(3)=O(1)

            for (int i = 0; i < arr.length - 1; i++) {   //[O(3)=O(1)] *n
                if (arr[i] > arr[i + 1]) {   //O(3)=o(1)] * n^2
                    swap(i, i + 1, arr); //O(1) * n^2

                                            //n^2

                }
            }
        }
    }

    void swap(int a, int b, int[] arr) {
        int temp = arr[a];  //O(1)
        arr[a] = arr[b];       //O(1)
        arr[b] = temp;         //O(1)
    }


    @Override
    public void sort(int[] a) {
        bubblesort(a);

    }
}

