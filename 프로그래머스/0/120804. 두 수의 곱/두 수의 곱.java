class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        
        boolean num1_b = (0 <= num1 && num1 <= 100);
        boolean num2_b = (0 <= num2 && num2 <= 100);
        
       
        if (num1_b && num2_b){
            answer = num1 * num2;
        } else {
            answer = 0;   
        }
        return answer;
    }
}