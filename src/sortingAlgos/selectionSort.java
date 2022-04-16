package sortingAlgos;

public class selectionSort {
    public static void main(String args[]){
        int arr[]={-9,45,34,2,1,-1};

        /*
        To begin with this algo assumes array in 2 halves, 1. Sorted  2. Unsorted

        * Select  element in the array (index it that we select, index of smallest element
        * while beginning the algo assume first element is smallest
        * iterate through the array and if you find the smallest element than the one whuch we selected, then
        * consider the index of that element(which means it'll be the smallest for rest of the iteration
        *
        * Swap the min element with the FIRST element of the Unsorted part
        *
        * */
        for(int i=0;i<arr.length;i++) {
            int min = i;                    //Remember its the INDEX we assigning
            for (int j = i+1; j < arr.length - 1; j++) {
                if(arr[j]<min){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        System.out.println(arr);
    }
}
