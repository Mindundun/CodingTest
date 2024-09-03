class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        //4자 제외한 글자는 *로 대치 후 마지막 4글자만 정상 출력
        answer = "*".repeat(phone_number.length()-4) + phone_number.substring(phone_number.length() - 4);
        
        
        return answer;
    }
}