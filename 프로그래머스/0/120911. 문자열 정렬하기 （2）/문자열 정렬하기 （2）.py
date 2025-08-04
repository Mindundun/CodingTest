def solution(my_string):
    # 아스키코드 순서로 정렬하기에 소문자 변경 후 정렬!
    return ''.join(sorted(my_string.lower()))