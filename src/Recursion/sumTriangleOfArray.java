package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class sumTriangleOfArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[]=new int[n];
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        list.add(new ArrayList<Integer>());
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            list.get(0).add(arr[i]);
        }
        sumOfTriangle(arr,list,list.size());
        for(int i=list.size()-1;i>=0;i--){
            System.out.println(list.get(i));
        }
    }

    public static void sumOfTriangle(int arr[], ArrayList<ArrayList<Integer>> list,int inc){

        list.add(new ArrayList<Integer>());
        //System.out.println(list.get(inc));
        int j=inc-1;
        for(int i=0;i<list.get(j).size()-1;i++){
            int sum=list.get(j).get(i)+list.get(j).get(i+1);
            list.get(inc).add(sum);
            //System.out.println(list.get(j).size()-1+" "+inc);
        }
        if(list.get(list.size()-1).size()<2){
            // if(inc==5){
            //  System.out.println(list.get(inc));
            return;
        }
       // sumOfTriangle(arr,list,list.size());
        sumOfTriangle(arr,list, list.size());



    }

}
