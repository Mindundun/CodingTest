import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        while (n > 0) {
            answer += n % 10;   // 현재 자릿수의 값
            n /= 10;            // 자릿수 -1
        }

        return answer;
    }
}