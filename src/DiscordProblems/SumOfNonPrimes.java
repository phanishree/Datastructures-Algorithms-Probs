package DiscordProblems;

import java.util.Scanner;

public class SumOfNonPrimes {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of numbers ");
        n=sc.nextInt();
        int sumOfNonPrimes=0;

       int nums[]=new int[n];


        System.out.println("Enter the numbers");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=2;j<=nums[i]/2;j++){
                if(nums[i]%j==0){
                    sumOfNonPrimes+=nums[i];
                    break;
                }
            }
        }
        String sss="3*2";
        int uuu=Integer.parseInt(sss);
        System.out.println("The sum is "+sumOfNonPrimes);
    }
}
