import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        //5개 제외하여 배열 지정
        int[] answer = new int[num_list.length-5];
        
        //오름차순 정렬
        Arrays.sort(num_list);
        
        //정렬한 배열 중 앞 5자리 제외한 후 삽입
        for(int i = 0;i < num_list.length-5; i++){
            answer[i] = num_list[i+5];
        }
        return answer;
    }
}