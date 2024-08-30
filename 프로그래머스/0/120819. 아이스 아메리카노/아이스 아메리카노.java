class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        
        //마실 수 있는 아메 잔
        answer[0] = money/5500; 
        
        //거스름돈
        answer[1] = money%5500; 
        
        
        return answer;
    }
}