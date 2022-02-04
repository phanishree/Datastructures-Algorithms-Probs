package DynamicProgramming;

import java.util.Scanner;

public class UglyNumbers {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        long a[]=new long[100];
        int k=2;
        a[1]=1;
        int c=0;
        long ans=0;
        for(long i=2;c<=n;i++){
            if(i%2==0.0){
                a[k++]=i;
                c++;
                ans=i;
                continue;
            }
            if(i%3==0.0){
                a[k++]=i;
                c++;
                ans=i;
                continue;
            }
            if(i%5==0.0){
                a[k++]=i;
                c++;
                ans=i;
                continue;
            }
        }
        System.out.println(ans);
    }
}
