import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = players;
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<players.length; i++) {
           map.put(players[i], i);  // player들의 배열 요소번호를 map에 put
        }
        
        for(int i=0; i<callings.length; i++) {
            if(map.containsKey(callings[i])) {
                int index = map.get(callings[i]);
                String temp = answer[index];
                answer[index] = answer[index-1];
                answer[index-1] = temp;
                map.put(answer[index-1], index-1);
                map.put(answer[index], index);
            }
        }
       
        
        return answer;
    }
}
