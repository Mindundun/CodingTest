class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for(int i = 0; i < my_string.length(); i++){
            int num = (int) my_string.charAt(i);
            
            if(num >= 48 && num <= 57){
                answer += Character.getNumericValue(num);
            }
        }
        
        return answer;
    }
}