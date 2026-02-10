import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int size = queries.length;        
        int[] answer = new int[size];
        
        for(int i = 0; i < size; i++){
            // copyOfRange는 마지막 파라미터 -1개 까지 배열을 자르기에 +1 
            int[] arrResult = Arrays.copyOfRange(arr, queries[i][0], queries[i][1] + 1);
            
            // 배열 값 중 queries[i][2]보다 크면서 가장 작은 값을 담을 변수
            int min_value = -1;
            
            for(int n : arrResult){
                // queries[i][2]보다 큰 경우
                if (n > queries[i][2]) {
                    if (min_value == -1 || n < min_value) {
                        min_value = n;
                    }
                }
            }
            
            // 위에서 구한 min_value 값을 배열에 넣음
            answer[i] = min_value;            
        }
        
        return answer;
    }
}