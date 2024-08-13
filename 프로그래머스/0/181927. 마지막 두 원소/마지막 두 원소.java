class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];         
        
        System.arraycopy(num_list, 0, answer, 0, num_list.length); // 주어진 num_list룰 answer 배열에 복사
        int after_int = num_list[num_list.length-1];
        int before_int = num_list[num_list.length-2];
        
        if (after_int > before_int) { //마지막 원소가 그전 원소보다 크면
            answer[answer.length-1] =(after_int - before_int);//마지막 원소에서 그전 원소를 뺀 값
        } else {//마지막 원소가 그전 원소보다 크지 않다면
            answer[answer.length-1] = (after_int *2); //마지막 원소를 두 배한 값을 추가
        }
                
        return answer;
    }
}