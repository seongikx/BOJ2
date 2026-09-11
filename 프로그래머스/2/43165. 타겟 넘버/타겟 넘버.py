# 각 자리 부호 바꿀수 있음
# 더해서 그 값이 나오는지 확인하는 로직
# 1. 그값이 나올수 있는지 확인하고 -> 값이 나올때 부호 몇개 바꿔야하는지 찾고 ? 
# 2. 모든 자리 부호 하나씩 바꿔서 완탐 ? 
def solution(numbers, target):
    answer = 0

    def dfs(index, total):
        if index == len(numbers):
            if(total == target):
                return 1
            return 0
        # + 선택
        plus = dfs(index+1, total + numbers[index])
        # - 선택
        minus= dfs(index+1, total - numbers[index])
        return plus + minus
    answer = dfs(0,0)
    return answer


