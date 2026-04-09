#투 포인터로 다시 풀기 
#기존 n+m log n+m 투포인터 n+m

import sys
input = sys.stdin.readline

n, m = map(int,input().split())

arr1 = list(map(int,input().split()))
arr2 = list(map(int,input().split()))

i = 0
j = 0
res = []

while i < n and j < m :
    if arr1[i] < arr2[j] :
        res.append(arr1[i])
        i += 1
    else :
        res.append(arr2[j])
        j += 1

res.extend(arr1[i::])
res.extend(arr2[j::])

print(*res)