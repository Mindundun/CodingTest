import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        
        //공백 기준으로 자르기
        answer = my_string.split(" ");        
        return answer;
    }
}