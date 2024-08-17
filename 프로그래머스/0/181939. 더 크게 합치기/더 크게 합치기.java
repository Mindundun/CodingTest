class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String oneSum = String.valueOf(a) + String.valueOf(b);
        String twoSum = String.valueOf(b) + String.valueOf(a);
        
        int one = Integer.valueOf(oneSum);
        int two = Integer.valueOf(twoSum);
        answer = (one >= two ? one : two);
            
        return  answer;
    }
}