class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
      
        for (char ch : my_string.toCharArray()) {
            String str = String.valueOf(ch); // char를 String으로 변환
            answer = answer + str.repeat(n); // String으로 변환한 후 repeat 사용
        }
        return answer;
    }
}