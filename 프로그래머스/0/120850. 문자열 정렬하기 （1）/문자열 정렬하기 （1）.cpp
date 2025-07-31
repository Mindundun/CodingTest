#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(string my_string) {
    vector<int> answer;
    
    for(char str:my_string){
        if (isdigit(str)){ //문자열의 한글자마다 숫자인 경우 확인
            answer.push_back(str-48); //문자이기에 -48처리하여 숫자로 insert
        }
    }
    sort(answer.begin(), answer.end()); //정렬
    return answer;
}