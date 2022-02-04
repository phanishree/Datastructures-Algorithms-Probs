package Recursion;

import java.util.Scanner;

public class printDecreasingIncreasing {
    static  int c=0;
    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        //int c=n;
   // c=n;
        printD( n);
    }

    public static void printD(int n){

        if(n<1){
            return;
        }
        System.out.println(n);
        printD(n-1);
        System.out.println(n);
    }

}