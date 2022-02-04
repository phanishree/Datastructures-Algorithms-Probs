package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class allOccuredIndicesOfarray {
    public static void main(String ars[]) {
        Scanner sc = new Scanner(System.in);
       /*     System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int arr[]=new int[n];
    System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }   */
        //  int arr[]={20,18,35,17,45,35,18,17};
        int arr[] = {2, 3, 6, 9, 8, 3, 2, 3, 6, 4};
        int indices[]=new int[arr.length];
       int a1[]= AllOccurances(arr,3,0,0);
       System.out.println(Arrays.toString(a1));
    }

    public static int[] AllOccurances(int arr[],int ele,int ind,int fsf){

        if(ind==arr.length){
            int indices[]=new int[fsf];
            return indices;
        }
     if(arr[ind]==ele){
        int iarr[]=AllOccurances(arr,ele,ind+1,fsf+1);
        iarr[fsf]=ind;
        return iarr;
     }else{
       int iarr[]=AllOccurances(arr,ele,ind+1,fsf);
       return iarr;
     }


    }
}
