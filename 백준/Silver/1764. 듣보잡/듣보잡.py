import sys
input = sys.stdin.readline

n,m = map(int,input().split())

dl = set()
ans = []
for _ in range(n) :
    dl.add(input().strip())

for _ in range(m) : 
    cnt = 0
    ds = input().strip()
    
    if ds in dl :
        ans.append(ds)

ans.sort()
print(len(ans))
for i in range(len(ans)) :
    print(ans[i])