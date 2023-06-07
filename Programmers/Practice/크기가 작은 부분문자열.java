import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int strLength = p.length();
        
        for(int i=0; i<t.length()-strLength+1; i++) {
            long sub = Long.parseLong(t.substring(i, i+strLength));
            if(Long.parseLong(p) >= sub)
                answer++;       
        }
            
        return answer;     
    }
}
