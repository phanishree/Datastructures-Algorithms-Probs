package DiscordProblems;

import java.util.Scanner;

public class PrefixSuffix {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the string 1");
        String s1=sc.nextLine();
        System.out.println("Enter the string 2");
        String s2=sc.nextLine();
        //ramisgoogood
        //goodforall
        String s3="";
        boolean flag=true;
        for(int i=0,j=0;i<s1.length();i++){

            if(s1.charAt(i)==s2.charAt(j)){
                int dum=i;

               while(dum!=s1.length()){

                   if(s1.charAt(dum)==s2.charAt(j)){

                       s3+=s1.charAt(dum)+"";
                       dum++;
                       j++;

                   }else{
                       j=0;
                       s3="";
                       break;
                   }
               }
            }
        }

if(s3.equals("")){
    System.out.println("No overlapping");
}else{
    System.out.println(s3);
}
    }
}
