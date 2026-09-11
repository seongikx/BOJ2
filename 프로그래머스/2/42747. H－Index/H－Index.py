def solution(citations):
    answer = 0
    a = list(citations)
    a.sort(reverse = True)
    print(a)
    for i in range(0,len(a)):
        if(a[i] >= i+1):
            answer = i+1
    return answer

# n편중 h번이상 논문 h이상이고 , 나머지 h번이하 인용시 h-index가 h의 최대값