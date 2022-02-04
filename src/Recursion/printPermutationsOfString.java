package Recursion;

import java.util.Scanner;

public class printPermutationsOfString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        printPermutations(str,"");

    }
    public static void printPermutations(String ques,String ans){

        if(ques.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<ques.length();i++){
            char c=ques.charAt(i);
            String lpart=ques.substring(0,i);
            String rpart=ques.substring(i+1);
            String roq=lpart+rpart;
            printPermutations(roq,ans+c);
        }
    }
}
