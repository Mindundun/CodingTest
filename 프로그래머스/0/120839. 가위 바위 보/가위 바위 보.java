class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        for(int i = 0;i < rsp.length(); i++){
            switch (rsp.charAt(i)){
                case '0':
                    answer = answer + "5"; // 0이면 5
                    break;
                case '2':
                    answer = answer + "0"; // 2이면 0
                    break;
                case '5':
                    answer = answer + "2"; // 5이면 2
                    break;
            }
                
            
            
        }
        return answer;
    }
}