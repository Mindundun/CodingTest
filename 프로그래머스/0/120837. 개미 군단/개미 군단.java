class Solution {
    public int solution(int hp) {
        int answer = 0;
        int remainHp = hp;
        
        answer = hp/5; //장군개미 공격력 5
        remainHp = hp%5; //장군개미 공격력 5
        
        
        answer = answer + remainHp/3; //병정개미 공격력 3
        remainHp = remainHp%3; //병정개미 공격력 3
        
        answer = answer + remainHp/1; //일개미 공격력 1
        remainHp = remainHp%1; //일개미 공격력 1
        
        return answer;
    }
}