class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        
        // 정렬되지 않은 배열임으로 반복문
        // 정렬되어있다면 Arrays.binarySearch가 시간복잡도 좋음
        for(int i = 0 ; i < num_list.length; i++){
            if (num_list[i] == n){
                answer = 1;
                break;
            }
        }
            
        return answer;
    }
}