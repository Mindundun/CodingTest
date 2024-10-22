import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        // 나눠어 떨어지는 숫자의 개수는 가변적
        ArrayList<Integer> answer_temp = new ArrayList<>();
        
        for(int value:arr){
            if(value % divisor == 0){
                answer_temp.add(value);
            }
        }
        
        // answer_temp 정렬
        Collections.sort(answer_temp);
        
        // answer 배열 선언
        int[] answer;
        
        if (answer_temp.isEmpty()) { 
            // 나누어지는 숫자가 없다면
            // 길이 1인 배열 생성 및 -1 할당
            answer = new int[]{-1};
            
        } else{
            //answer_temp의 길이만큼 배열 생성
            answer = new int[answer_temp.size()];

            // answer_temp의 요소를 answer로 복사
            for (int i = 0; i < answer_temp.size(); i++) {
                answer[i] = answer_temp.get(i);
            }
        
        }
        
        
        
        return answer;
    }
}