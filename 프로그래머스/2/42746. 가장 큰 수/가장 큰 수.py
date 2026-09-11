from functools import cmp_to_key

def compare(a,b):
    ab = str(a) + str(b)
    ba = str(b) + str(a)
    
    if(ab > ba):
        return -1
    elif (ba > ab):
        return 1
    else:
        return 0

    
def solution(numbers):
    answer = ''
    a = list(numbers)
    a.sort(key=cmp_to_key(compare))
    for x in a:
        answer += str(x)
    if(answer[0] =='0'):
        return "0"
    return answer