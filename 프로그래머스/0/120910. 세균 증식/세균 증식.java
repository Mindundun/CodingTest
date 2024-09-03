class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        //2를 t회 pow
        answer = n * (int) Math.pow(2, t);
        return answer;
    }
}