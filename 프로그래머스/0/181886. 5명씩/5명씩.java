import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        ArrayList<String> list = new ArrayList<>();
        
        // 5의 배수번째 이름을 리스트에 추가
        for (int i = 0; i < names.length; i++) {
            if (i % 5 == 0) {
                list.add(names[i]);  // add 메서드를 사용
            }
        }
        
        // ArrayList를 String 배열로 변환
        String[] answer = new String[list.size()];
        answer = list.toArray(answer);  // ArrayList의 내용을 배열로 복사
        
        return answer;
    }
}
