package Problems;

import java.util.HashMap;
import java.util.HashSet;

class Solution1 {
    public boolean halvesAreAlike(String s) {

        HashMap<String,String> hs=new HashMap();
        HashSet<String> h1=new HashSet();
        HashSet<String> h2=new HashSet();

        hs.put("A","a");
        hs.put("E","e");
        hs.put("I","i");
        hs.put("O","o");
        hs.put("U","u");

        String s1=s.substring(0,(s.length()/2));
        String s2=s.substring((s.length()/2),s.length());
        int c1=0,c2=0;

        System.out.println("s1="+s1+" "+"s2="+s2);

        //bo ok
        for(int i=0;i<s1.length();i++){


            if(hs.containsValue(s1.charAt(i)+"")||hs.containsKey(s1.charAt(i)+"")){
                if(h1.contains((s1.charAt(i)+""))){

                }else{
                    c1++;
                    h1.add((s1.charAt(i)+""));
                }

            }
        }
        for(int i=0;i<s2.length();i++){

            if(hs.containsValue(s2.charAt(i)+"")||hs.containsKey(s2.charAt(i)+"")){
                if(h2.contains((s2.charAt(i)+""))){

                }else{
                    c2++;
                    h2.add((s2.charAt(i)+""));
                }
            }
        }

        return c1==c2;

    }
}
public class StringHalvesCountVowels {
    public static void main(String args[]){

        String s="book";
        new Solution1().halvesAreAlike(s);

    }
}
