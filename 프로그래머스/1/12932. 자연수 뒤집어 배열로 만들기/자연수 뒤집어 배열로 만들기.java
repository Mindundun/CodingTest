class Solution {
    public int[] solution(long n) {
        int digit_length = String.valueOf(n).length();
        // n개 기준으로 공간 생성
        int[] answer = new int[digit_length];
        
        //뒤집어 배열에 담기
        for (int i = 0; i < digit_length; i++) {
            answer[i] = (int) (n % 10); // 1의 자리 추출
            n /= 10; // n을 10으로 나누어 다음 숫자 추출 준비
        }
        
        return answer;
    }
}