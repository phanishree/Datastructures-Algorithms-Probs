package DiscordProblems;


import java.util.Arrays;
import java.util.Scanner;

public class RotateDTimes {

    public static void main(String args[]){
        int a[]={1,3,5,7,9,11};
       // Scanner sc=new Scanner(System.in);
       // System.out.println("Enter the value of d");
       // int d=sc.nextInt();

        int d=25;

        int arraySize=a.length;
        for(int i=0;i<d;i++){
            int temp=a[0];
            int k=0,j;
            for(j=0;j<arraySize-1;j++,k++){
                a[k]=a[j+1];
            }
            a[a.length-1]=temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
