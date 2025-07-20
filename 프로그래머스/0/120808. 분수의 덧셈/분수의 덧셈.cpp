#include <string>
#include <vector>
#include <numeric>// 최소공배수를 구하기 위한 include

using namespace std;

vector<int> solution(int numer1, int denom1, int numer2, int denom2) {
    vector<int> answer;
    int lcmNum = lcm(denom1, denom2); //최소공배수 구하기
    
    //분자 : 통분만 함
    int sumNum = (numer1 * (lcmNum/denom1)) + (numer2 * (lcmNum/denom2));
    
    //분모 : 통분만 함
    int sumDen = lcmNum;
    
    //위에서 구한 분자와 분모 약분
    int gcdNum = gcd(sumNum, sumDen);
    
    answer.push_back(sumNum / gcdNum);
    answer.push_back(sumDen / gcdNum);
    return answer;
}