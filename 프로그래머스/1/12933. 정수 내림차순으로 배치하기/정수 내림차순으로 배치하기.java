import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        // Long형 데이터를 String으로 변환
        String str = Long.toString(n);
        // 위의 변환한 str을 문자열 변수에 대입
        char[] ch = str.toCharArray();
        
        //문자열 변수 정렬(오름차순)
        Arrays.sort(ch);
        
        //오름차순으로 정렬된 문자열 배열을 String으로 변경하면서 내림차순으로 변경
        String sortedNumber = new StringBuilder(new String(ch)).reverse().toString();
        
        //Long형으로 형변환
        answer = Long.parseLong(sortedNumber);
        
        return answer;
    }
}