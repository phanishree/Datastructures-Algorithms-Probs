package DiscordProblems;

import java.util.HashMap;
import java.util.Scanner;

//Encoding of string based on the below 2 conditions
/*
Step -1:Swap the first and second character of the string S, then swap the 3rd and 4th character, then the 5th and 6th character and so on. If the length of S is odd, the last character should not be swapped with any other.
Step-2:Replace each occurrence of the letter 'a' in the message obtained after the first step by the letter 'z', each occurrence of 'b' by 'y', each occurrence of 'c' by 'x', etc.
*/
public class SavingThePrivateChef {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s="";

        System.out.println("Enter the word");
        s=sc.nextLine();
        //aara
        //0123
        char phase1Encoding[];
        phase1Encoding=s.toCharArray();
        if(s.length()%2==0){

           for(int i=0,j=1;i<s.length()&&j<s.length();) {
               char temp = phase1Encoding[i];
               phase1Encoding[i] = phase1Encoding[j];
               phase1Encoding[j] = temp;
               i = i + 2;
               j = j + 2;
           }
        }else{

            for(int i=0,j=1;i<s.length()-1&&j<s.length()-1;) {
                char temp = phase1Encoding[i];
                phase1Encoding[i] = phase1Encoding[j];
                phase1Encoding[j] = temp;
                i = i + 2;
                j = j + 2;
            }
            phase1Encoding[phase1Encoding.length-1]=s.charAt(s.length()-1);
        }

        HashMap<Character,Character> map=new HashMap();
        for(int i=97;i<=122;i++){
            char value= (char) ((122-i)+97);
            char key= (char) i;
            map.put(key,value);
        }

        for(int i=0;i<phase1Encoding.length;i++){
            phase1Encoding[i]=map.get(phase1Encoding[i]);
        }

        String Encoded=new String(phase1Encoding);

        System.out.println("Encoded word is:"+Encoded);

    }
}
