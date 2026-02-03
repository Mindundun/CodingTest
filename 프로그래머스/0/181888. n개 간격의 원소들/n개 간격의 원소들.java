class Solution {
    public int[] solution(int[] num_list, int n) {
        
        // 배열에 담을 크기 지정
        int size = (num_list.length + n - 1) / n;
        
        // 변수 선언
        int[] answer = new int[size];
        
        // 위에서 구한 배열 사이즈만큼 반복하면서 n번째의 숫자를 뽑아 넣음
        for (int i = 0; i < size; i++) {
            answer[i] = num_list[i * n];
        }

        return answer;
    }
}

