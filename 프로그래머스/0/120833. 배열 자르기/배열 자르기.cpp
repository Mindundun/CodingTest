#include <string>
#include <vector>
#include <iostream>

using namespace std;

vector<int> solution(vector<int> numbers, int num1, int num2) {
    // [num1, num2)이기에 num2 + 1 처리함
    vector<int> answer(numbers.begin() + num1, numbers.begin() + num2 + 1); 
   
    return answer;
}