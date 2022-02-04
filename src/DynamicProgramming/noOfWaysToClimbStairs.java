package DynamicProgramming;

public class noOfWaysToClimbStairs {
    public static void main(String args[]){
        //The problem is, there are N steps and you are at step 0. You have to find ways to reach the top of the stairs
        // At once you can take either take 1 step or 2 step.

        int noOfWays1=0;
        int noOfWays2=0;

        noOfWays1=new noOfWaysToClimbStairs().recursiveWay(5);
        System.out.println(noOfWays1);
        int dp[]=new int[6];
        new noOfWaysToClimbStairs().dynamicProgrammingWay(5,dp);
        System.out.println(dp[5]);
    }
    public  int recursiveWay(int n){

        if(n==0)
            return 1;

        if(n<0)
            return 0;
        int oneStep=0;
        int twoStep=0;

        oneStep+=recursiveWay(n-1);
        twoStep+=recursiveWay(n-2);

        return oneStep+twoStep;
    }

    public int dynamicProgrammingWay(int n,int [] dp){


        //Think about the recursive tree of the above recurive way, then you'll get an idea to reduce the number of calls

        if(n==0)
            return 1;

        if(n<0)
            return 0;

        int oneStep=0;
        int twoStep=0;

       if(dp[n]==0){
           oneStep+=dynamicProgrammingWay(n-1,dp);
           twoStep+=dynamicProgrammingWay(n-2,dp);

           dp[n]=oneStep+twoStep;
       }


           return dp[n];



    }

}
