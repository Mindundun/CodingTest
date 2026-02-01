import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer;
        List<Integer> sumNumbers = new ArrayList<>();
        
        // 배열의 n 숫자를 뒤에 다른 친구들과 더해서 넣음.(버블 느낌)
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                sumNumbers.add(numbers[i] + numbers[j]);
            }
        }
        
        
       
        // 마지막에 Set 처리
        Set<Integer> result = new TreeSet<>(sumNumbers);

        // Set을 배열로 변환해줌
        answer = result.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}