package Problems;

import java.util.Arrays;

class caandies {
    public int distributeCandies(int[] candyType) {

        Arrays.sort(candyType);
        String s=candyType[0]+"";
        for(int i=0;i<candyType.length-1;i++){
            if(candyType[i]!=candyType[i+1])
                s=s+candyType[i+1];
        }
        //1 1 1 2 2 3 3  4 5
        //4
        //1 2 3 4 5
        System.out.println(candyType);
        System.out.println(s+" The string");
        if(s.length()>candyType.length/2)
            return s.length()-(s.length()-candyType.length/2);
        else
            return s.length();


    }
}
public class distributing_candies{
    public static void main(String args[]){

        int a[]={100000,0,100000,0,100000,0,100000,0,100000,0,100000,0};
            new caandies().distributeCandies(a);
    }


}