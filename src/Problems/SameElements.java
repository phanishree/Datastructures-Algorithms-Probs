package Problems;

//Same Elements problem (#program-1-solution)
import java.util.Arrays;
import java.util.HashSet;

public class SameElements {
    public static void main(String args[]){

        int nums[]={18,18,18,18,17,45,45,1};
        HashSet<Integer> hset=new HashSet();
        for(int i:nums){
            hset.add(i);
        }

        if(hset.size()==1){
            System.out.println("True");
        }else{

            int UniqueSorted[]=new int[hset.size()];
            int j=0;

            for(int i:hset){
                UniqueSorted[j]=i;
                j++;
            }

            Arrays.sort(UniqueSorted);

            System.out.println(Arrays.toString(UniqueSorted));
        }

    }
}
