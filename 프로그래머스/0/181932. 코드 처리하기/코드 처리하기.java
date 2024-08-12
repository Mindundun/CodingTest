class Solution {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        int mode = 0; // 시작 시 mode는 0
        
        
        for( int i = 0 ; i < code.length() ; i++ ){
            if(code.charAt(i) == '1'){ //해당 문자가 1이면 스위치 (XOR로)
                mode = mode ^ 1;
            }else{
                if (mode == 0 && i % 2 == 0){   // mode가 0이면 짝수번째의 글자를 append
                    answer.append(code.charAt(i));
                } else if (mode == 1 && i % 2 != 0){ // mode가 1이면 홀수번째의 글자를 append
                    answer.append(code.charAt(i));
                }
            }               
        }           
        
        // StringBuilder를 문자열로 변환
        String result = answer.toString();
        
        return result.isEmpty() ? "EMPTY" : result; 
    }
}