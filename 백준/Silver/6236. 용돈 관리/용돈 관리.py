import sys
input = sys.stdin.readline

n,m = map(int,input().split())
money = []

for _ in range(n) :
        money.append(int(input()))

#일단 최대값을 찾은다음
#일단 최대값을 찾은 다음
#하루 쓸 남은돈으로 K원이 M번이하로 생활가능한지 판단해야함

ans = 0

#주어진 돈으로 살수 있는지 
def can(p) : 
    tmp = p
    cnt = 1

    for i in range(n) :
        if tmp < money[i] :
            cnt += 1
            tmp = p
        tmp -= money[i]
    return cnt <= m

#합리적 돈찾기 알고리즘

lt = max(money)
rt = sum(money)

while lt<= rt :
    mid = (lt + rt) // 2

    if can(mid) :
        ans = mid
        rt = mid -1
    else :
        lt = mid + 1
        
    
print(ans)