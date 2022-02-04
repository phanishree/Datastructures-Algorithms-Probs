package Recursion;

import java.util.Scanner;

public class FindLastOcuurance {

    public static void main(String ars[]){


        Scanner sc=new Scanner(System.in);
       /*     System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int arr[]=new int[n];
    System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }   */

      //  int arr[]={20,18,35,17,45,35,18,17};
        int arr[]={2,3,6,9,8,3,2,3,6,4};

        int x=lastOccurance(arr,0,3);
        System.out.println("The index of last occurance of element 3 is:"+x);
    }
    public static int lastOccurance(int arr[],int ind,int ele){

        if(ind==arr.length){
            return -1;
        }
        int liosa=lastOccurance(arr, ind+1, ele);
        if(arr[ind]==ele&&ind>liosa){
            return ind;
        }else{
            return liosa;
        }
    }
}
/*   int arr[]={20,18,17,45,35,18,17};
* 0
* 1
* 2
* 3 6
* 4 6
* 5 6
* 6 -1
* 7
* */