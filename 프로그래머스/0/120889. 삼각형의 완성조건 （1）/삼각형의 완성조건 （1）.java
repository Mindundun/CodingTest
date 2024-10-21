import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        // 배열 정렬
        Arrays.sort(sides);
        
        // 짧은 두 변의 합계 > 가장 긴 변 길이 : 삼각형 생성 조건
        if (sides[0] + sides[1] > sides[2]){
            answer = 1;
        } else {
            answer = 2;
        }
        
        return answer;
    }
}