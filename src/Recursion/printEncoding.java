package Recursion;

import java.util.Scanner;

public class printEncoding {
    public static void main(String args[]){


        Scanner sc=new Scanner(System.in);

        String toBeEncoded=sc.nextLine();
        printEncodings(toBeEncoded,"");



    }

    public static void printEncodings(String ques,String ans){

        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        else if(ques.length()==1){

            char ch=ques.charAt(0);
            if(ch=='0'){
                return;
            }else{
                int dig=ch-'0';
                char ch1=(char)(char)('a'+dig-1);;
                System.out.println(ans+ch1);
            }

        }else{

            char ch2=ques.charAt(0);
            String roq = ques.substring(1);
            if(ch2=='0'){
                return;
            }else {
                int dig = ch2 - '0';

                char ch1 = (char) (char)('a'+dig-1);;
                printEncodings(roq, ans + ch1);
            }
                String ch12=ques.substring(0,2);
                String roq2=ques.substring(2);
                int dig1=Integer.parseInt(ch12);

                if(dig1<=26){
                    char ch3=(char)('a'+dig1-1);
                    printEncodings(roq2,ans+ch3);
                }


        }


    }
}
