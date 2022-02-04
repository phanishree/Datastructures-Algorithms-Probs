package DiscordProblems;

import java.util.Arrays;

public class DoubleOfAnElementInAnArray {
    public static void main(String ars[]){

        int[] a={51,6,6,6,31,2,10,56};
        //2,3,5,6,6,6,10,56
        //0,1,2,3,4,5,6,7

        Arrays.sort(a);
        boolean b=false;
        for(int i=0;i<a.length;i++){

            int s=i;
            int e=a.length-1;
            int key=a[i]*2;
            if(b)
                break;
            while(s<=e){

                int mid=(e+s)/2;
                if(key==a[mid]){
                    b=true;
                    break;
                }else if(key<a[mid]){
                    e=mid-1;
                }else if(key>a[mid]){
                    s=mid+1;
                }
            }
        }
        if(b)
            System.out.println("True");
        else
            System.out.println("False");

       /* boolean f=false;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]*2==a[j]){
                    System.out.println("True");
                    f=true;
                }
            }
            if(f)
                break;
        }
        if(!f){
            System.out.println("False");
        }*/


    }
}
