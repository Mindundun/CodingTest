class Solution {
    public String solution(String my_string) {
        short Stringchar = 0;
        String answer = "";
        
        for(int i = 0 ; i < my_string.length() ; i++){
            Stringchar = (short)(my_string.charAt(i));
            if (Stringchar >= 65 && Stringchar <= 90){ // 대문자인 경우
                answer += (char)(Stringchar+32);
            } else if(Stringchar >= 97 && Stringchar <= 122){ // 소문자인 경우
                answer += (char)(Stringchar-32);
            }
            
        }
        return answer;
    }
}