def solution(my_string, num1, num2):
    answer = ''
    # 순서 변경을 위해 리스트
    str_list = list(my_string)
    # 순서를 변경
    str_list[num1], str_list[num2] = str_list[num2], str_list[num1]

    return ''.join(str_list) # 리스트라 문자열로 만들기 위함# 리스트라 문자열로 만들기 위함