#include <string>
#include <vector>

using namespace std;

int solution(int slice, int n) {
    int answer = 0;
    // 인원수 대비 조각 피자 수를 나눈 후 나머지가 있으면 1판 추가
    answer = n / slice + (n % slice > 0 ? 1 : 0);
    return answer;
}