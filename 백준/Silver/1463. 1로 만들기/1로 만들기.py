import sys
input = sys.stdin.readline

n = int(input())

ans = 0
dp = [0] * (n+3)


dp[2] = 1
dp[3] = 1

for i in range(4,n+1) :
    
    #dp[i] 채워나가야함 
    dp[i] = dp[i-1] + 1

    if i%2 == 0 :
        if (dp[i//2] + 1) < dp[i] :
            dp[i] = dp[i//2] + 1
    
    if i%3 == 0 :
        if (dp[i//3] +1) < dp[i] :
            dp[i] = dp[i//3] + 1
    
print(dp[n])