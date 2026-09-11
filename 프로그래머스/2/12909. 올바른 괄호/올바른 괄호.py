def solution(s):
    answer = True
    stack = []

    left = 0
    right = 0
    
    for i in range(0,len(s)):
        if(s[i] == '(') :
            stack.append('(')
        elif(s[i] == ')' and len(stack) > 0) :
            stack.pop()
        else:
            return False
    
    if(len(stack) == 0) :
        return True
    return False