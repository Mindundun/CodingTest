import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        // 배열은 0부터 시작
        int[] answer = new int[n+1];
        
        // 배열 0부터 n까지 
        answer = Arrays.copyOfRange(num_list, 0, n);
        
        
        return answer;
    }
}