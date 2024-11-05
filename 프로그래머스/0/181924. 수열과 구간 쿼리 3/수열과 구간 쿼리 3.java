import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        //변경할 인덱스 자리
        int index1 = 0;
        int index2 = 0;
        
        // 변경할 숫자 담는 변수
        int num = 0;;
        
        for (int i = 0 ; i < queries.length; i++){
            // 값 바꿀 인덱스 담기
            index1 = queries[i][0];
            index2 = queries[i][1];            
            
            // 값 바꾸기
            num = arr[index1];            
            arr[index1] = arr[index2];
            arr[index2] = num;
        }
        //배열 복사
        System.arraycopy(arr, 0, answer, 0, arr.length);
        
        return answer;
    }
}