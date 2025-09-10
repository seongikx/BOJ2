import sys
input = sys.stdin.readline

num, quest = map(int, input().split())
arrnum = list(map(int, input().split()))

prefix_sum = [0]
temp = 0

for i in arrnum:
    temp = temp + i
    prefix_sum.append(temp)
    
for i in range(quest):
    x, y = map(int, input().split())
    print(prefix_sum[y] - prefix_sum[x-1])