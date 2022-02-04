package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class getMazePathsWithJumps {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int dstRow=sc.nextInt();
        int dstCol=sc.nextInt();
        ArrayList<String> paths=getPathsWithJumps(1,1,dstRow,dstCol);
        System.out.println(paths);


    }
    public static ArrayList<String> getPathsWithJumps(int row, int col, int dstRow, int dstCol) {

        if(col==dstCol&&row==dstRow){
            ArrayList<String> a=new ArrayList<>();
            a.add("");
            return a;
        }

        ArrayList<String> ans=new ArrayList<>();
        for (int i = 1; i <= dstCol-col; i++){

              ArrayList<String> hpaths=  getPathsWithJumps(row, col+i,dstRow,dstCol);
                for(String hpath:hpaths){
                    ans.add("h"+i+hpath);

            }
    }
        for (int i = 1; i <= dstRow-row; i++){
            ArrayList<String> vpaths=  getPathsWithJumps(row+i, col,dstRow,dstCol);
            for(String vpath:vpaths){
                ans.add("v"+i+vpath);
            }
        }

        for (int i = 1; i <= dstCol-col&&i<=dstRow-row; i++){
          //  if ( i< dstCol) {
              ArrayList<String> dpaths=  getPathsWithJumps(row+i, col+i,dstRow,dstCol);
            for(String dpath:dpaths){
                ans.add("d"+i+dpath);
            }
          //  }
        }



        return ans;
    }
}
