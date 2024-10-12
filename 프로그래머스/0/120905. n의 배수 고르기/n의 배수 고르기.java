import java.util.ArrayList;
class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> TempAnswer = new ArrayList<>();

        // n의 배수인지 확인
        for (int num : numlist) {
            if (num % n == 0) {
                TempAnswer.add(num); // n의 배수
            }
        }
        
       
        // ArrayList를 배열로 변환
        int[] answer = new int[TempAnswer.size()];
        for (int i = 0; i < TempAnswer.size(); i++) {
            answer[i] = TempAnswer.get(i);
        }

        return answer;
    }
}