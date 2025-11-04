#include<iostream>
using namespace std;

int score;

int main(){
    ios::sync_with_stdio(false); // C 표준 입출력과 동기화 끄기
    cin.tie(NULL); cout.tie(NULL);

    cin >> score;

    if (score <= 100 && score >=90)
    {
        cout << "A";
    } else if (score <= 89 && score >= 80) {
        cout << "B";
    } else if (score <= 79 && score >= 70) {
        cout << "C";
    } else if (score <= 69 && score >= 60) {
        cout << "D";
    } else {
        cout << "F";
    }
    
}