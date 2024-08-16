class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = n;
        if (n%2 == 0) // 짝수
        {
            //n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return
            for (int i = 0 ; i < n/2+1 ; i++)
            {
                answer += num*num;
                num-= 2;
            }
            
        }
        else
        {
            //n 이하의 홀수인 모든 양의 정수의 합
            for (int i = 0 ; i < (n/2)+1 ; i++)
            {
                answer += num;
                num-= 2;
            }
            
        }
        
        
        return answer;
    }
}