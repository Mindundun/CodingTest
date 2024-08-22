class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        int max_value = (a >= b) ? a : b;
        int min_value = (a >= b) ? b : a;
        int cnt = (max_value == min_value) ? 1 : max_value - min_value +1;
        

        for (int i = 0; i < cnt; i++){
            answer =  answer + min_value + i;
        }
        return answer;
    }
}