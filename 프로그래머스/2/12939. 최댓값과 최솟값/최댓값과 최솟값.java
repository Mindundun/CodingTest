class Solution {
    public String solution(String s) {
        String[] answer = s.split(" ");
        //초기값 세팅      
        int min_value = Integer.parseInt(answer[0]);
        int max_value = Integer.parseInt(answer[0]);   
        
        for (int i = 1 ; i < answer.length;i++){
            min_value = Integer.parseInt(answer[i]) < min_value? Integer.parseInt(answer[i]):min_value;
            max_value = Integer.parseInt(answer[i]) > max_value? Integer.parseInt(answer[i]):max_value;
        }
        return min_value + " " + max_value;
    }
}