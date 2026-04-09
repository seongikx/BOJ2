import sys
input = sys.stdin.readline

n, m = map(int,input().split())

arr1 = list(map(int,input().split()))
arr2 = list(map(int,input().split()))

for i in range(m) :
    arr1.append(arr2[i])

arr1.sort()
for i in range(n+m) :
    print(arr1[i], end =" ")