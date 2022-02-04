package Recursion;

import java.util.Scanner;

public class factorial {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("The factorial of number is:"+ fact(n));
    }

    public static int fact(int n){
        int answer;
        if(n==0){
            return 1;
        }else{
            answer=n*fact(n-1);
        }
        return answer;

    }
}
