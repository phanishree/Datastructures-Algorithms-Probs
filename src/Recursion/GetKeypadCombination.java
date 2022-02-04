package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetKeypadCombination {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String chars[]={"?!","abc","def","ghi","jkl","mnop","qrst","uv","wxyz",",;"};

        System.out.println("Enter the key pad combo");
        String combo=sc.next();
        //5 7 3
        ArrayList<String> answer=getCombo(combo,chars);

        System.out.println(answer);
    }
    public static ArrayList<String> getCombo(String combo,String[] chars){


    if(combo.length()==1){
        char s[]=chars[Integer.parseInt(combo)].toCharArray();
        ArrayList<String> al=new ArrayList<>();
        for(char c:s)
            al.add(c+"");
        return al;
    }
    String num=combo.charAt(0)+"";
    ArrayList<String> al2=getCombo(combo.substring(1),chars);

    ArrayList<String> res=new ArrayList<>();
   // int i=0;
    char c[]=chars[Integer.parseInt(num)].toCharArray();
   for(char ch:c){
       for(String s:al2){
           res.add(ch+s);
       }
   }

        return res;
    }
}
