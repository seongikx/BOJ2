def solution(A,B):
    answer = 0
    
    a = list(A)
    b = list(B)
    
    a.sort()
    b.sort()
    
    for i in range(0,len(A)):
        answer += a[i] * b[len(A)-i-1]

    return answer