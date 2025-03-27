class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        // 배열 2개 길이가 같다는 전제 하에 배열의 각 요소를 곱하기
        for (int i = 0; i < absolutes.length; i++) {
            // 이전에 구한 합(answer) + 숫자 배열(absolutes) + 부호 배열(signs)
            // 부호 배열의 경우 true면 1을 곱하고 false인 경우 -1를 곱한다
            answer = answer + absolutes[i] * (signs[i] ? 1 : -1);
        }
        
        return answer;
    }
}