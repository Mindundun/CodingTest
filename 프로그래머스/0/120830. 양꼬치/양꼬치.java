class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int freeDrink = 0;
            
        //10인분마다 음료 1캔 서비스 개수 구하기
        freeDrink = n / 10;
        
        //만약 10인분 이하로 먹어서 서비스를 받을 수 없는 경우 처리
        if (freeDrink <= 0){
            freeDrink = 0;
        }
        
        //양꼬치(n) 12,000원, 음료수(k) 2,000원 - 서비스 음료
        answer = n * 12000 + k * 2000 - freeDrink * 2000;
        
        return answer;
    }
}