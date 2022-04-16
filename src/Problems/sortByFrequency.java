package Problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class sortByFrequency {
    public static void main(String args[]){

        int arr[]={1,2,3,4,5,5,5,5,5,5,8,8,9};
        int max=-1;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }

        int freq[]=new int[max+1];

        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
            set.add(arr[i]);
        }
        int helper[]=new int[freq.length];
        for(int i=0;i<freq.length;i++){
            helper[i]=freq[i];
        }
        Arrays.sort(helper);
        int another[]=new int[set.size()];


    }

}
