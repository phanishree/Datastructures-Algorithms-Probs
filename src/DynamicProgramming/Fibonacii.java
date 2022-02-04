package DynamicProgramming;

import java.util.Scanner;

public class Fibonacii {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;

        for(int i=2;i<dp.length;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }

        System.out.println("The fibonaci of n is:"+dp[dp.length-1]);
    }
}
