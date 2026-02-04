class Solution {
    public int[] solution(int[] num_list, int n) {
        int size = num_list.length - n + 1;

        int[] answer = new int[size];

        //배열의 시작은 0번째 부터라 -1
        int num = n - 1;
        
        for(int i = 0; i < size; i++){            
            answer[i] = num_list[num];
            num ++;
            
        }
        
        return answer;
    }
}