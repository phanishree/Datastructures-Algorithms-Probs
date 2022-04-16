package sortingAlgos;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String args[]){
        int arr[]={-9,45,34,2,1,-1};

        /*Bubble sort starts iteration from beginning , and compares the element next to it and if
        the element is smller then it swaps itself with it. This process keeps happening till the last element

        consider,   int arr[]={-9,45,34,2,1,-1};

        Bubble sort works like this
        {-9,34,2,1,-1,45}  in the first iteration, 45 went all the way down
         {-9,2,1,-1,34,45} in the second iteration, 34 went all the way down
          {-9,1,-1,2,34,45} in the third iteration, 2 went all the way down
           {-9,-1,1,2,34,45} in the fourth iteration, 1 went all the way down


         bubbleSort(array)
            for i <- 1 to indexOfLastUnsortedElement-1
                if leftElement > rightElement
                swap leftElement and rightElement
            end bubbleSort

           Ta-Da the array is sorted
           Time complexity is : O(n**2)
        *
        */
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
