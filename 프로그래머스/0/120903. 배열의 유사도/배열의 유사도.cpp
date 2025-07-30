#include <string>
#include <vector>
#include <iostream>

using namespace std;

int solution(vector<string> s1, vector<string> s2) {
    int answer = 0;
    
    for (string str1:s1){
        for (string str2:s2){
            if (str1 == str2){ //배열 s1과 배열 s2을 반복하며 배열 유사도 체크
                answer += 1; // 같다면 +1 
            }
        }
    }
    return answer;
}