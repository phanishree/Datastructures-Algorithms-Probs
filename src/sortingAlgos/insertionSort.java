package sortingAlgos;

import java.util.Arrays;

public class insertionSort {
    public static void main(String args[]){
        int arr[]={-9,45,34,2,1,-1};
            /*
            * Insertion sort also assumes array into 2 halves 1.Sorted   2.Unsorted
            *
            * Left part is sorted, right part is unsorted
            *
            * insertion sort says to sort the array till 0-i+1 on every iteration
            * by this, left part is always sorted
            *
            * Time complexity: O(n**2)
            *
            * */
        for(int i=0;i<=arr.length-2;i++){

            int j=i+1;
            while(j>=1&&arr[j]<arr[j-1]){       //j ALWAYS compares with the left part of the array

                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
