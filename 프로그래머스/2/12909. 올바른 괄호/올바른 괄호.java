import java.util.ArrayList;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int par = 0;
        
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (ch == '(') {
                par = par + 1;
            } else if (ch == ')') {
                if(par == 0){
                    answer = false;                  
                } else {
                    par--; // 닫힌 괄호가 나오면 열린 괄호를 감소시킴
                }
            }
        }

        // 모든 열린 괄호가 닫혔는지 확인
        return par == 0 && answer==true;
    }
}