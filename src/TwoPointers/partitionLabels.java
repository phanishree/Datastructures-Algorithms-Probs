package TwoPointers;

import java.util.ArrayList;

public class partitionLabels {
    public static void main(String args[]){
        String s="ababcbacadefegdehijhklij";
        ArrayList<Integer> parts=new ArrayList<>();

      int i=0,j=s.length()-1;
      int f=0;
      String seen="";
      while(i<s.length()&&j>=0){
          System.out.println("i:"+i+" j:"+j);
          f=0;
          char beg=s.charAt(i);
          char end=s.charAt(j);
          if(beg==end){
              f=j;
              seen+=beg;
              int m=i+1;
              int n=s.length()-1;
                  while (m < j) {
                      char beg1 = s.charAt(m);
                      char end1 = s.charAt(n);
                      if(seen.contains(s.charAt(m)+"")){
                          m++;
                      }else {
                          if (beg1 == end1) {
                              if (n > f) {
                                  f = n;
                              }
                              m++;
                              n = s.length() - 1;
                          } else {
                              n--;
                          }
                      }
                  }
              parts.add(s.substring(i,f+1).length());
              i=f+1;
                  j=s.length()-1;

          }else{
              j--;
          }



      }
        System.out.println(parts);
    }
}
