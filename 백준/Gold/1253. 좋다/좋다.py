import sys
input = sys.stdin.readline

n= int(input())
arr = list(map(int,input().split()))
arr.sort()

def two_sum(arr,target,idx) :
    left = 0
    right = len(arr) -1

    while left < right :
        
        if left == idx :
            left += 1
            continue
        elif right == idx :
             right -= 1
             continue
    
        tmp = arr[left] + arr[right]

        if tmp == target :
            return True
        elif tmp < target :
                left += 1
        else :
                right -=1
    return False

cnt = 0

for i in range(n) :
    if two_sum(arr,arr[i],i) : 
        cnt += 1

print(cnt)

