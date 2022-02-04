package Recursion;

import java.util.Scanner;

public class MaxOfArray {

    public static void main(String ars[]){
        Scanner sc=new Scanner(System.in);
       /*     System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int arr[]=new int[n];
    System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }   */

        int arr[]={20,18,17,45,35,4};
       System.out.println("The max element is:"+ maxOfArray(arr,0));
    }

    public static int maxOfArray(int arr[],int ind){


        if(ind==arr.length-1){
            return arr[ind];
        }
      int temp =maxOfArray(arr,ind+1);
      if(arr[ind]>temp){
         return arr[ind];
      }else{
          return temp;
      }




    }
}
