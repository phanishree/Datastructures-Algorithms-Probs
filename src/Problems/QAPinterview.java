package Problems;

import java.util.ArrayList;
import java.util.Scanner;

public class QAPinterview {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       /* String indDate="";
        indDate=sc.next();
        System.out.println(indDate+" thisis indian date format");
        String usDate[]=indDate.split("/");
        String date=usDate[0];
        String month=usDate[1];
        String year=usDate[2];
        String actDate=month+"/"+date+"/"+year;
        System.out.println(actDate+" this is US date format");*/

       /* String name=sc.next();
        String revOfName="";
        for(int i=name.length()-1;i>=0;i--){
            char ch=name.charAt(i);
            revOfName+=ch;
        }
        System.out.println("Reversal  is : "+revOfName);*/

       /* String city=sc.nextLine();
        System.out.println(city);
        String divided[]=city.split(" ");
        String first=divided[0];
        String second=divided[1];
        System.out.println(first+" "+second);
        System.out.println(first.substring(0,1)+" "+second.substring(0,1));*/

        ArrayList<Integer> a1=new ArrayList<>();
        a1.add(1);
        a1.add(2);
        ArrayList<Integer> a2=new ArrayList<>();
        a2.add(3);
        a2.add(4);
        a1.addAll(a2);
        System.out.println(a1);

    }
}
