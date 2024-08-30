import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        // 배열 정렬
        Arrays.sort(array);
        // 중앙값 찾기
        answer = array[array.length / 2];
       
        return answer;
    }
}