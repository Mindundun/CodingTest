class Solution {
    public int solution(int price) {
        int answer = 0;
        double discountRate = 0.0;
    
        // 할인율 구하기
        if ((price >= 100000) && (price < 300000)) {
            discountRate = 0.05;
        } else if ((price >= 300000) && (price < 500000)) {
            discountRate = 0.1;
        } else if ((price >= 500000)) {
            discountRate = 0.2;
        } 
        
        answer = (int) (price - (price * discountRate));

        return answer;
    }
}