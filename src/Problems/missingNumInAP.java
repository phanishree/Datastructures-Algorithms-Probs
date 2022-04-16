package Problems;

import java.util.Scanner;

public class missingNumInAP {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //2 4 6 10
        //6+commondifference=6+2=8
        //8
        //r=2

        int commonDifference=Integer.MAX_VALUE;

        for(int i=0;i<n-1;i++){                 //takes care about the common difference between the elements
            commonDifference=Math.min(commonDifference,arr[i+1]-arr[i]);
        }

        System.out.println("common difference is "+ commonDifference);

        for(int i=0;i<n;i++){           //Finds the missing element
            if(arr[i+1]-arr[i]!=commonDifference){
                System.out.println("missing element is "+(arr[i]+commonDifference));
                break;
            }
        }


    }
}
