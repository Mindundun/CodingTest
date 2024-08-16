class Solution {
    public double solution(int[] numbers) {
        double hap = 0;
        for (int i = 0; i < numbers.length; i++){
            hap += numbers[i];
        }
        return hap/numbers.length;
    }
}