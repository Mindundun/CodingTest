class Solution {
    public boolean solution(int x) {
        int n = x;      //입력받은 값을 조작할 변수
        int sum = 0;    //입력받은 수의 자리수를 합 할 변수
        
        int length = String.valueOf(x).length(); // 입력받은 수의 길이
        
        // 입력받은 수의 길이만큼 반복
        for(int i = 0; i < length; i++){
            sum = sum + (n % 10);           //입력받은 수의 일의자리수 합계 
            n = n / 10;                     //위에서 더한 일의자리수 제거
        }        
    
        return x % sum == 0;     //입력받은수를 더한수로 나눴을 때 나누어 떨어지는지
    }
}