import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        //배열 정렬
        Arrays.sort(numbers);
        
        //가장 마지막 원소, 그 다음 마지막 원소의 곱 = 최댓값
        answer = numbers[numbers.length-1] * numbers[numbers.length-2];
        
        return answer;
    }
}