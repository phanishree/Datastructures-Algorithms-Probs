package DiscordProblems;

import java.util.Arrays;
import java.util.HashMap;

public class maximumProductOf3 {
    public static void main(String args[]){
        int arr[]={-1, 9, 22, 3, -15, -7};
                    //-15,-7,-1,3,9,22
         //-7*-15*22
        //1,3,5,9,79
int max=-999;
int n=arr.length;
int ans=0;
for(int i=0;i<n;i++){
    for(int j=i+1;j<n;j++){
        for(int k=j+1;k<n;k++){
            int prod=arr[i]*arr[j]*arr[k];
            ans=Math.max(prod,max);
            max=ans;
        }
    }
}
System.out.println(ans);

    }
}
