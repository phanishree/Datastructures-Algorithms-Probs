package Recursion;

public class minMaxOfArray {
    public static void main(String main[]){
        int arr[]={1, 4, 3, -5, -4, 8, 6};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int minMax[]=new int[2];
        minMax[0]=Integer.MAX_VALUE;
        minMax[1]=Integer.MIN_VALUE;
        int l=0;
        minMax(arr,l,minMax);
        System.out.println("Minimum is "+minMax[0]);
        System.out.println("Maximum is "+minMax[1]);
    }
    public static void minMax(int arr[],int i,int[] mm){

        System.out.println(i);
        if(i==arr.length)
            return;

        if(arr[i]<mm[0]){
            mm[0]=arr[i];
        }
        if(arr[i]>mm[1]){
            mm[1]=arr[i];
        }
        i++;
        minMax(arr,i,mm);
    }
}
