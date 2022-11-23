import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer;
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<arr.length; i++) {
            if(stack.size()==0) {
                stack.push(arr[i]);
            }else {
                if(stack.peek() != arr[i]) {
                    stack.push(arr[i]);
                }
            }
        }
        
        answer = new int[stack.size()];
        for(int i=stack.size()-1; i>=0; i--) {
            answer[i] = stack.pop();
        }
               
        return answer;
    }
}
