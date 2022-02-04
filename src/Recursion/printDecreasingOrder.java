package Recursion;

import java.util.Scanner;

public class printDecreasingOrder {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number from where the decreasing order should begin");
        int n=sc.nextInt();
        System.out.println("The decreasing order is:");
        DecreasingOrderWithRecursion(n);

    }

    public static void DecreasingOrderWithRecursion(int n){
        if(n<0) {
            return;
        }
        System.out.println(n);
        DecreasingOrderWithRecursion(n-1);
    }
}
