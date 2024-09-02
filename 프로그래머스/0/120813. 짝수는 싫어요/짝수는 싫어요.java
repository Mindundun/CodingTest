class Solution {
    public int[] solution(int n) {
        //올림
        int size = (int)Math.ceil(n/2.0);

        int[] answer = {};
        answer = new int[size];
        
        //첫번째 배열의 값은 1로 
        answer[0] = 1;
        
        for(int i = 1; i < size; i++){
            //이전 배열값 기준 2씩 증가
            answer[i] = answer[i-1] +2;
        }
        
        return answer;
    }
}