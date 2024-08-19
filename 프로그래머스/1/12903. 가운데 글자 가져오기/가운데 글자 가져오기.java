class Solution {
    public String solution(String s) {
        String answer = "";
        
        int mid_Val_int =s.length()/2;
        double mid_Val_double =s.length()/2.0;
        
        if (mid_Val_int == mid_Val_double){
            answer = s.substring(mid_Val_int-1, mid_Val_int+1);
        } else {
            answer = Character.toString(s.charAt(mid_Val_int));
        }
        
        return answer;
    }
}