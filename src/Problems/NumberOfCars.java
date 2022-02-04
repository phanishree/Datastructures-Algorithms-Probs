package Problems;

//Number of cars problem (#program-2-solution)
import java.util.Scanner;

public class NumberOfCars {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of people:");
        int people=sc.nextInt();
        numberOfCars(people);
    }
    public static void numberOfCars(int people){
        double p=people;
        int answer=(int)Math.ceil(p/5.0);
        System.out.println(answer);
    }

}
