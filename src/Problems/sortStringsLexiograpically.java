package Problems;

import java.util.*;

public class sortStringsLexiograpically {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1="dcba";//sc.nextLine();
        String s2="edcb";//sc.nextLine();
        String s3="decb";//sc.nextLine();

        HashMap<Character, ArrayList<Character>> mainMap=new HashMap<>();
        HashSet<Character> set=new HashSet<>();
        ArrayList<Character> list=new ArrayList<>();

        for(int i=0;i<s1.length();i++){
            char c1=s1.charAt(i);
            char c2=s2.charAt(i);
            set.add(c1);
            set.add(c2);
            if(!mainMap.containsKey(c1)){
                mainMap.put(c1,new ArrayList<Character>());

                mainMap.get(c1).add(c2);
            }else{

                mainMap.get(c1).add(c2);
            }

            if(!mainMap.containsKey(c2)){
                mainMap.put(c2,new ArrayList<Character>());

                mainMap.get(c2).add(c1);
            }else{

                mainMap.get(c2).add(c1);
            }
            if(mainMap.containsKey(c2)){
                mainMap.get(c1).addAll(mainMap.get(c2));
            }
            if(mainMap.containsKey(c1)){
                mainMap.get(c2).addAll(mainMap.get(c1));
            }
        }

        for(char i:set){
            list.add(i);
        }
        Collections.sort(list);
        System.out.println(mainMap);

        String ans="";

        for(int i=0;i<s3.length();i++){
            char chh=s3.charAt(i);
            for(int j=0;j<list.size();j++){
                char c=list.get(j);
                if(mainMap.get(c).contains(chh)){
                    ans+=c;
                    break;
                }
            }

        }

        System.out.println(ans);

    }
}
