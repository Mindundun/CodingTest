import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        // ArrayList로 가변적 처리
        ArrayList<Integer> answer_temp = new ArrayList<>();
        
        
        // 배열이 비어있지 않은 경우 무조건 추가
        if (arr.length > 0) {
            answer_temp.add(arr[0]); // 무조건 추가
        }
        
        // 연속된 중복 제거
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) { // 현재 원소와 이전 원소 비교
                answer_temp.add(arr[i]); // 다르면 추가
            }
        }
        
        // ArrayList를 int 배열로 변환
        int[] answer = new int[answer_temp.size()]; // size()로 크기 설정
        for (int i = 0; i < answer_temp.size(); i++) {
            answer[i] = answer_temp.get(i); // 원소 복사
        }
        
        return answer;
    }
}