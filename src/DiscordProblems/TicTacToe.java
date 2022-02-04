package DiscordProblems;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter first line of X's and O's");
        String line1=sc.nextLine();
        System.out.println("Enter second line of X's and O's");
        String line2=sc.nextLine();
        System.out.println("Enter third line of X's and O's");
        String line3=sc.nextLine();
        String bigLine=line1+line2+line3;

        String l1[]=bigLine.split(" ");
        String main="";
        for(int i=0;i<7;i++)
            main+=l1[i];

        StringBuilder s=new StringBuilder(main);
        if((s.substring(0,3).equals("xxx"))||s.substring(3,6).equals("xxx")||s.substring(6,9).equals("xxx")){
            System.out.println("Aarabhi wins");
        }else if((s.charAt(0)+s.charAt(3)+s.charAt(6)+"").equals("xxx")||(s.charAt(1)+s.charAt(4)+s.charAt(7)+"").equals("xxx")||(s.charAt(2)+s.charAt(5)+s.charAt(8)+"").equals("xxx")){
            System.out.println("Aarabhi wins");
        }else if((s.charAt(0)+s.charAt(4)+s.charAt(8)+"").equals("xxx")||(s.charAt(2)+s.charAt(4)+s.charAt(6)+"").equals("xxx")){
            System.out.println("Aarabhi wins");
        }else{
            if((s.substring(0,3).equals("ooo"))||s.substring(3,6).equals("ooo")||s.substring(6,9).equals("ooo")){
                System.out.println("Atharva wins");
            }else if((s.charAt(0)+s.charAt(3)+s.charAt(6)+"").equals("ooo")||(s.charAt(1)+s.charAt(4)+s.charAt(7)+"").equals("ooo")||(s.charAt(2)+s.charAt(5)+s.charAt(8)+"").equals("ooo")){
                System.out.println("Atharva wins");
            }else if((s.charAt(0)+s.charAt(4)+s.charAt(8)+"").equals("ooo")||(s.charAt(2)+s.charAt(4)+s.charAt(6)+"").equals("ooo")){
                System.out.println("Atharva wins");
            }else{
                System.out.println("Tie");
            }
        }


    }
}
