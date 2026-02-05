class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        // 추출할 문자열의 시작 점 찾기
        int start_num = my_string.length() - n;
        
        // 추출하기
        answer = my_string.substring(start_num);
        
        return answer;
    }
}