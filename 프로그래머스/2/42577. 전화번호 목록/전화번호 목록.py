def solution(phone_book):
    a = list(phone_book)
    a.sort()
    for i in range(len(a)-1) :
            if (a[i+1].startswith(a[i])) :
                return False
    return True