#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

bool solution(int x) {
    bool answer = true;
    int len = 0;
    int sum = 0;
    int tmp = x;
    int tmp1 = x;
    
    while(tmp > 0)
    {
        tmp = tmp / 10;
        len++;
    }
    
    for(int i =0; i < len; i++)
    {
        sum += x % 10;
        x = x / 10;
    }
    
    if(tmp1 % sum != 0)
        answer = false;
    
    return answer;
}