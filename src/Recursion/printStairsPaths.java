package Recursion;

import java.util.Scanner;

public class printStairsPaths {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        getStairsPath(n,"");
    }
    public static void getStairsPath(int n,String path){

        if(n==0){
            System.out.println(path);
            return;
        }
        if(n<0){

            return;
        }

        getStairsPath(n-1,path+1);

        getStairsPath(n-2,path+2);

        getStairsPath(n-3,path+3);

    }
}
