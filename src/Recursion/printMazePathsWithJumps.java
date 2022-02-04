package Recursion;

import java.util.Scanner;

public class printMazePathsWithJumps {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int dstRow=sc.nextInt();
        int dstCol=sc.nextInt();
        printPathsWithJumps(1,1,dstRow,dstCol,"");
    }
    public static void printPathsWithJumps(int row,int col,int dstRow,int dstCol,String paths){

        if(row==dstRow && col==dstCol){
            System.out.println(paths);
            return;
        }

        for(int i=1;i<=dstCol-col;i++){
            printPathsWithJumps(row,col+i,dstRow,dstCol,paths+"h"+i);
        }
        for(int i=1;i<=dstRow-row;i++){
            printPathsWithJumps(row+i,col,dstRow,dstCol,paths+"v"+i);
        }
        for(int i=1;i<=dstCol-col&&i<=dstRow-row;i++){
            printPathsWithJumps(row+i,col+i,dstRow,dstCol,paths+"d"+i);
        }
    }
}
