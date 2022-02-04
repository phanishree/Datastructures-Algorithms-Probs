package Recursion;

import java.util.Scanner;

public class FloodFill {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<a[0].length;j++)
                a[i][j]=sc.nextInt();
        }
        boolean visited[][]=new boolean[n][m];
        floodfillPaths(a,0,0,"",visited);
    }

    public static void floodfillPaths(int maze[][],int row,int col,String psf,boolean visited[][]){


        if(row<0||col<0||row==maze.length||col==maze[0].length||maze[row][col]==1||visited[row][col]==true){

            return;
        }
        if(row==maze.length-1&&col==maze[0].length-1){
            System.out.println(psf);
            return;
        }
        visited[row][col]=true;
        floodfillPaths(maze,row-1,col,psf+"t",visited);
        floodfillPaths(maze,row,col-1,psf+"l",visited);
        floodfillPaths(maze,row+1,col,psf+"d",visited);
        floodfillPaths(maze,row,col+1,psf+"t",visited);
        visited[row][col]=false;
    }
}
