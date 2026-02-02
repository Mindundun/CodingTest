class Solution {
    // 나중에 2차원 배열로 풀이해보기!

    // 1번 수포자 : 1, 2, 3, 4, 5
    // 2번 수포자 : 2, 1, 2, 3, 2, 4, 2, 5
    // 3번 수포자 : 3, 3, 1, 1, 2, 2, 4, 4, 5, 5
    public int[] solution(int[] answers) {
        int[] answer1 = {1, 2, 3, 4, 5};
        int[] answer2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] answer3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
                               
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        
        for(int i = 0; i < answers.length; i++){
            if (answer1[i % answer1.length] == answers[i]) count1 ++;
            if (answer2[i % answer2.length] == answers[i]) count2 ++;
            if (answer3[i % answer3.length] == answers[i]) count3 ++;
        }
        
        // 가장 정답을 많이 맞춘 갯수        
        int max_num = Math.max(Math.max(count1, count2), count3);

        int size = 0;
        if (count1 == max_num) size++;
        if (count2 == max_num) size++;
        if (count3 == max_num) size++;

        int[] answer = new int[size];
        int idx = 0;

        if (count1 == max_num) answer[idx++] = 1;
        if (count2 == max_num) answer[idx++] = 2;
        if (count3 == max_num) answer[idx++] = 3;

        
        return answer;
    }
}