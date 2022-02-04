package Recursion;

import java.util.Scanner;

public class NumberOfWaysToClimbSteps {

    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of steps");
        int n=sc.nextInt();
        int[] possibleWaysToClimbSteps={2,4,5,8}; //which means, only 2 steps at once or ,4 steps at once, or 5 at once ,or 8 at once
        System.out.println("The number of ways to climb to the top using the given possible ways to climb steps are:"+waysToClimb(n,possibleWaysToClimbSteps));
    }

    public static int waysToClimb(int n, int possibleSteps[]){
        if(n==0){
            return 1;
        }

        int nbWays=0;
        for(int i:possibleSteps){
            if(n-i>=0){
                nbWays+=waysToClimb(n-i,possibleSteps);
            }
        }

        return nbWays;
    }
}
