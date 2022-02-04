package Recursion;

import java.util.Scanner;

public class DisplayArray {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
       /*     System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int arr[]=new int[n];
    System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }   */

        int arr[]={20,18,17,45,35};
        System.out.println("Printing array in normal order: ");
        printArray(arr,0);
        System.out.println("Printing array in reverse order: ");
        printArrayReverse(arr,0);


    }

    public static void printArray(int arr[],int ind){
        if(ind==arr.length){
            return;
        }
        System.out.println(arr[ind]);
        printArray(arr,ind+1);
    }

    public static void printArrayReverse(int arr[],int ind){
        if(ind==arr.length){
            return;
        }

        printArrayReverse(arr,ind+1);
        System.out.println(arr[ind]);
    }
}
