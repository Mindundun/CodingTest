class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        //제한사항
        boolean num1_b = (0 <= num1 && num1 <= 10000);
        boolean num2_b = (0 <= num2 && num2 <= 10000);
        
        if (num1_b && num2_b && (num1==num2)){
            answer = 1;
        } else if (num1_b && num2_b && (num1!=num2)){
            answer = -1;
        }
        
            
        return answer;
    }
}