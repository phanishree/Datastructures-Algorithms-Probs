package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class getStairs {
    public static void main(String args[]){
        //  {1,2,3} no fo possible steps at  once
        //n=no of stairs
        //if n=4  --> 1111, 112,13,31,211,121,22
        //n=1 --> 1
        //n=2 --> 11,2
        //n=3 --> 111,12,21,3
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String> ans=getStairs(n);
        System.out.println(ans);


    }
public static ArrayList<String> getStairs(int n){

        if(n==0){
            ArrayList<String> a=new ArrayList<>();
            a.add("");
            return a;
        }
        if(n<0){
            return new ArrayList<String>();
        }

        ArrayList<String> p1=getStairs(n-1);
        ArrayList<String> p2=getStairs(n-2);
        ArrayList<String> p3=getStairs(n-3);

        ArrayList<String> ans=new ArrayList<>();
        for(String s:p1){
            ans.add("1"+s);
        }
    for(String s:p2){
        ans.add("2"+s);
    }
    for(String s:p3){
        ans.add("3"+s);
    }

        return ans;
}

}
