class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long hap = x;
        
        for(int i = 0; i < n; i++){
            answer[i] = hap;
            hap = hap + x;
        }
        return answer;
    }
    
   
}   