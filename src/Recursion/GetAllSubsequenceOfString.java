package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetAllSubsequenceOfString {
    public static void main(String ags[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the stirng:");
        String str=sc.next();
        ArrayList<String> answer=gss(str);
        System.out.println(answer);

    }

    public static ArrayList<String> gss(String str){
        /*
        * example: str=abc
        *           ch=a
        *           restOfString=bc
        *
        * */
        if(str.length()==0){
            ArrayList<String> emptyString=new ArrayList<>();
            emptyString.add("");
            return emptyString;
        }
        char ch=str.charAt(0);

        String restOfString=str.substring(1);

        ArrayList<String> recursionResult=gss(restOfString);

        ArrayList<String> myResult=new ArrayList<>();
        for(String s:recursionResult){
            myResult.add(""+s);
            myResult.add(ch+s);
        }

        return myResult;
    }
}
