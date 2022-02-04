package DiscordProblems;

import java.util.Scanner;

public class ClockAndAngles {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

         System.out.println("Enter the time (hh:mm) ");
        String time = sc.nextLine();
        String s[] = time.split(":");
        int hours = Integer.parseInt(s[0] + "");
        int minuites = Integer.parseInt(s[1] + "");
      /*  int finalAngle;
        if(minuites==00){

        }else{
            if(minuites>4){
                int tempMin=minuites/5;
               int tempAngle=Math.abs(tempMin-hours);
               tempAngle=tempAngle*15;
               // if(tempAngle>90)
                //    tempAngle=180-tempAngle;
                if(minuites%5!=0){
                    finalAngle=tempAngle+((minuites%5)*3);
                    if(finalAngle>90)
                        finalAngle=180-finalAngle;
                    System.out.println(finalAngle);
                }else{

                    System.out.println(tempAngle);
                }

            }else if(minuites<5&&hours<=6){

                int tempAngle=(15*hours)-(minuites*3);

                System.out.println(tempAngle);
            }*/

        int hourDegree=(hours*360)/12+(minuites*360)/(12*60);
        int minuitesDdegree=(minuites*360)/60;
        int finalAngle=Math.abs(hourDegree-minuitesDdegree);
        if(finalAngle>180)
            finalAngle=360-finalAngle;

        System.out.println(finalAngle);
        }




    }


