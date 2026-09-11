def solution(nums):
    answer = 0
    can = len(nums) // 2
    
    return min(can, len(set(nums)))