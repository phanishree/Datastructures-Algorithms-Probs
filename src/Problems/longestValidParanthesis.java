package Problems;

//3 approaches have been commented, check it out.
import java.util.Stack;

class Solution {
    public int longestValidParentheses(String s) {

     /* //Approach-1
        if(s==null || s.length() == 0)
            return 0;

        //"()()()()()"
        //"0123456789

        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(!stack.isEmpty() && s.charAt(i)==')' && s.charAt(stack.peek())=='(') {
                System.out.println("popiing ele is "+stack.peek());
                stack.pop();
            }
            else
            {
                System.out.println("pushing ele is "+i);
                stack.push(i);
            }

        }
        int index=-1;
        int max=0;
        for(int i:stack)
        {
            //System.out.println(i);
            max=Math.max(max,i-index-1);
            index=i;
        }
        max=Math.max(max,s.length()-index-1);
        return max;   */

    /*    //Approach-2 Top pointer approach        (optimal)
        int open=0,close=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='('){
                open++;
            }else{
                close++;
            }

            if(open==close){
                int len=open+close;
                max=Math.max(max,len);
            }
            else if(close>open){
                open=0;
                close=0;
            }
        }
        open=0;
        close=0;
        for(int i=s.length()-1;i>=0;i--){

            char ch=s.charAt(i);

            if(ch=='('){
                open++;
            }else{
                close++;
            }

            if(open==close){
                int len=open+close;
                max=Math.max(max,len);
            }
            else if(open>close){
                open=0;
                close=0;
            }
        }

        return max;  */

        //Approach-3 Stack approach
        int max=0;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                stack.push(i);
            }else{
                stack.pop();

                if(stack.isEmpty()){
                    stack.push(i);
                }else{
                    int len=i-stack.peek();
                    max=Math.max(max,len);
                }
            }

        }
        return max;


    }
}
public class longestValidParanthesis {

    public static void main(String args[]){

        String paranthesis="()()(()()()";
        System.out.println(new Solution().longestValidParentheses(paranthesis));
    }

}
