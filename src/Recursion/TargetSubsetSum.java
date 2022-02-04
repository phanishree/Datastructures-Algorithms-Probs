package Recursion;

import java.util.Scanner;

public class TargetSubsetSum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        int target=sc.nextInt();
        printSubsets(arr,target,"",0,0);
    }
    public static void printSubsets(int arr[],int target,String set,int index,int sum){

        if(index==arr.length){
            if(sum==target)
                System.out.println(set);

            return;
        }

        printSubsets(arr,target,set+arr[index]+",",index+1,sum+arr[index]);
        printSubsets(arr,target,set,index+1,sum);
    }
}
