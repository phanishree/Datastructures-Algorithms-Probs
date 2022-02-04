package DiscordProblems;

import java.util.Scanner;

public class PolynomialRep {

    public static void main(String argfs[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n=sc.nextInt();
        int pow[]=new int[n];
        int cof[]=new int[n];

        //Enter the powers in descending order
        for(int i=0;i<n;i++){
            System.out.println("Enter the pow and cof:"+(i+1));
            pow[i]=sc.nextInt();
            cof[i]=sc.nextInt();
        }

        String poly="";

        for(int i=n-1;i>=0;i--){
            if(cof[i]!=0){
                if(cof[i]>0){
                    if(pow[i]!=0)
                    poly=poly+" + "+cof[i]+"x^"+pow[i];
                    else
                        poly=poly+" + "+cof[i];
                }else{
                    if(pow[i]!=0)
                    poly=poly+" - "+(-1*cof[i])+"x^"+pow[i];
                    else
                        poly=poly+" - "+(-1*cof[i]);


                }
            }
        }
        if(poly.startsWith(" + ")){
            poly=poly.substring(3,poly.length());
        }

        System.out.println(poly);


    }
}
