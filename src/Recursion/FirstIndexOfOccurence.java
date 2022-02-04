package Recursion;

import java.util.Scanner;

public class FirstIndexOfOccurence {

    public static void main(String ars[]){


        Scanner sc=new Scanner(System.in);
       /*     System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int arr[]=new int[n];
    System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }   */

        int arr[]={20,18,17,45,35,18,17};
     int x=firstIndex(arr,17,0);
     System.out.println("The index of first occurancce of element 17 is: "+x);
    }

    public static int firstIndex(int arr[],int ele,int ind){

        boolean flag=false;
        if(ind==arr.length){
           // System.out.println(-1);
            return -1;
        }

        if(arr[ind]==ele){
          //  flag=true;
          // System.out.println(ind);
          // return;
            return ind;

        }else{
            int fisa=firstIndex(arr,ele,ind+1);
            return fisa;
        }





    }
}
