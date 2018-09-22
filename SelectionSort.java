public class SelectionSort implements SortingAlgorithm {

    int findmin(int pos, int[] arr){

        int min = pos;
        for(int k=pos+1;k<arr.length;k++){
            if(arr[k]<arr[min])     // O(n)
                min = k;
        }

        return min;
    }

    void selectionsort(int[] arr){

        for(int i =0;i<arr.length;i++){   //
            swap(i,findmin(i,arr),arr);   //findmin = O(n^2) swap is n* O(1)
        }
    }

    void swap(int a, int b, int[] arr){
        int temp= arr[a];  //O(1)
        arr[a]= arr[b];       //O(1)
        arr[b]= temp;         //O(1)
    }



    @Override
    public void sort(int[] a) {
        selectionsort(a);

    }
}
