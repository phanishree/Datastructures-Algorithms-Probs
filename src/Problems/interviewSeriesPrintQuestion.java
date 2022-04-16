package Problems;

import java.util.Scanner;

public class interviewSeriesPrintQuestion {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//n=3
        for(int i=1;i<=n;i++){

            for(int j=n;j>=1;j--){
                System.out.print((int)Math.pow(j,i)+" ");
            }
            System.out.println();
        }
    }
}
