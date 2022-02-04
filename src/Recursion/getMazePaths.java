package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class getMazePaths {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int dstRow=sc.nextInt();
        int dstCol=sc.nextInt();
        ArrayList<String> ans=getMazePaths(1,1,dstRow,dstCol);
        System.out.println(ans);

    }
    public static ArrayList<String> getMazePaths(int row,int col,int dstRow,int dstCol){


      //  System.out.println("row:"+row+" "+"col:"+col);

        if(row==dstRow&&col==dstCol){
            ArrayList<String> p=new ArrayList<>();
            p.add("");
            return p;
        }
      /*  if(col==dstCol&&row<dstRow){
            ArrayList<String> p=new ArrayList<>();
            p.add("");
            return p;

        } */
       /* if(row==dstRow){
            ArrayList<String> p=new ArrayList<>();
            p.add("");
            return p;
        }
        if(col==dstCol){
            ArrayList<String> p=new ArrayList<>();
            p.add("");
            return p;
        }*/

        ArrayList<String> hpaths=new ArrayList<>();
        ArrayList<String> vpaths=new ArrayList<>();

        if(col<dstCol){
            hpaths=getMazePaths(row,col+1,dstRow,dstCol);
        }

        if(row<dstRow){
            vpaths=getMazePaths(row+1,col,dstRow,dstCol);
        }


        ArrayList<String> ans=new ArrayList<>();

        for(String hpath:hpaths){
            ans.add("h"+hpath);
        }
        for(String vpath:vpaths){
            ans.add("v"+vpath);
        }

        return ans;
    }
}
