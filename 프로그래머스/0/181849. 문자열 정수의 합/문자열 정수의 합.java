class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        // 문자열의 각 문자에 대해 반복
        for (char c : num_str.toCharArray()) {
            // 문자 '0'의 아스키 코드(48)를 빼서 정수로 변환
            answer += c - '0';
        }
        return answer;
    }
}