class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        
        //삼항연산자도 있는데, 그냥 보기 편하게 if문
        //'dot의 원소는 0이 아니다' 전제로 0은 없다고 생각
        //dot[0] : x좌표, dot[1] : y좌표
        if (dot[0] > 0 && dot[1] > 0){// 1사분면
            answer = 1;
        } else if (dot[0] < 0 && dot[1] > 0){ // 2사분면
            answer = 2;
        } else if (dot[0] < 0 && dot[1] < 0){ // 3사분면
            answer = 3;
        } else if (dot[0] > 0 && dot[1] < 0){ // 4사분면
            answer = 4;
        } 
            
        return answer;
    }
}