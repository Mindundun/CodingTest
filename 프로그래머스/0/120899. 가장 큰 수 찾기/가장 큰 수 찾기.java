class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int maxNum = 0;
        
        for(int i = 0; i < array.length; i++){
            if (array[i] > maxNum) {                
                answer[0] = array[i]; // 최대값 넣기
                answer[1] = i;  //최대값의 인덱스 넣기
                
                maxNum = array[i]; // 해당 배열값을 최대값으로 세팅
            }
        }
        
        return answer;
    }
}