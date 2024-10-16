class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int oddCnt = 0;
        int evenCnt = 0;
        
        for (int i = 0 ; i < num_list.length; i++){
            if (num_list[i] % 2 == 0){
                evenCnt += 1;
            } else if(num_list[i] % 2 == 1){
                oddCnt += 1;
            }                
        }
        
        // 짝수의 수 : answer[0]에 삽입
        answer[0] = evenCnt;
        
        // 홀수의 수 : answer[1]에 삽입
        answer[1] = oddCnt;
        
        
        return answer;
    }
}