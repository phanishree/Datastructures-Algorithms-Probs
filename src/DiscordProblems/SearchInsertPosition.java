package DiscordProblems;

import java.util.Scanner;

public class SearchInsertPosition {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int []a={2,4,6,7,17,18};

        System.out.println("Enter the target");
        int target=sc.nextInt();

        if(a[0]>target){
            System.out.println("The possible position is:"+0);
        }else {

            for (int i = 0; i < a.length; i++) {
                if (a[i] == target) {
                    System.out.println(i);
                    break;
                } else if (a[i] > target) {
                    System.out.println("The possible position is:" + (i));
                    break;
                }
            }
        }

    }
}
