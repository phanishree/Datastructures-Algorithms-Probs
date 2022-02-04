package DynamicProgramming;

import java.util.ArrayList;
import java.util.Scanner;

public class CountSortedVowelsStrings {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        char vow[]={'a','e','i','o','u'};
        char c = 0;
        ArrayList<String> answer=count(n,vow,c);

    }
    public static ArrayList<String> count(int n,char[] vowels,char c){


        for(int i=0;i<vowels.length;i++){
            char ch=vowels[i];
            for(int j=i+1;j<vowels.length;j++){

            }

        }
        return null;
    }
}
