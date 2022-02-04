package DynamicProgramming;

import java.util.Scanner;

public class WatsToClimbStairsDP {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the steps to climb");
        int n=sc.nextInt();
       // System.out.println("Enter the possible steps to climb at a time");
        int possibleSteps[]={2,4,5,8};
        int dp[]=new int[n+1];
        dp[0]=1;
        
        for(int i=1;i<dp.length;i++){
            int nbWays=0;
            for(int steps:possibleSteps){
                if((i-steps)>=0){
                    nbWays+=dp[i-steps];
                }

            }
            dp[i]=nbWays;
        }
        System.out.println(dp[dp.length-1]);
    }
}
