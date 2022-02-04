package Recursion;

import java.util.Scanner;

public class printIncreasingOrder {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number from where the increasing order should end");
        int n=sc.nextInt();
        System.out.println("The increasing order is:");
        increasingOrderWithRecursion(n);


    }

    public static void increasingOrderWithRecursion(int end){

       /* if(start>end){
            return;
        }*/
       if(end<0){
           return;
       }
        increasingOrderWithRecursion(end-1);
        System.out.print(end+" ");
    }
}
