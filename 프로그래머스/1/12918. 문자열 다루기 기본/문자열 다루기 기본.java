class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        
        // 길이가 4 또는 6인지 먼저 확인
        if (s.length() == 4 || s.length() == 6) {
            // 정규식으로 숫자만 존재하는지 체크
            // s가 숫자로만 이루어져 있고, 최소 1글자 이상인가?
            answer = s.matches("\\d+");
        }        
        
        return answer;
    }
}