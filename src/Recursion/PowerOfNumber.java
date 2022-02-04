package Recursion;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of X");
        int x=sc.nextInt();
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int power1=powerOfx(x,n);

        System.out.println("The power of x is which uses O(n) time:"+power1);

        int power2=powerOfxLogN( x,n);

        System.out.println("The power of x is which uses O(log(n)) time:"+power2);



    }

    public static int powerOfx(int x,int n){

        /*
         * this method takes time of O(n).
         *
         * */
        if(n<1){
            return 1;
        }
        int ans=x*powerOfx(x,n-1);

        return ans;
    }

    public static int powerOfxLogN(int x,int n){
        /*
        * this method takes time of O(log(n)) which is better than O(n).
        *
        * */
        if(n<1){
            return 1;
        }

        int halfAns=powerOfxLogN( x,n/2);
        int ans=halfAns*halfAns;

        if(n%2!=0){
            ans=ans*x;
        }

        return ans;

    }
}
