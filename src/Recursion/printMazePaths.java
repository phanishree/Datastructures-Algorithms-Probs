package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class printMazePaths {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int dstRow=sc.nextInt();
        int dstCol=sc.nextInt();
        getMazePaths(1,1,dstRow,dstCol,"");
       // System.out.println(ans);

    }
    public static void getMazePaths(int row,int col,int dstRow,int dstCol,String paths){


        //  System.out.println("row:"+row+" "+"col:"+col);
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
        if(row>dstRow||col>dstCol){
            return;
        }
        if(row==dstRow&&col==dstCol){
            System.out.println(paths);
            return;
        }
    //    System.out.println(paths);

            getMazePaths(row,col+1,dstRow,dstCol,paths+"h");


            getMazePaths(row+1,col,dstRow,dstCol,paths+"v");




      /*  ArrayList<String> ans=new ArrayList<>();

        for(String hpath:hpaths){
            ans.add("h"+hpath);
        }
        for(String vpath:vpaths){
            ans.add("v"+vpath);
        }*/


    }
}
