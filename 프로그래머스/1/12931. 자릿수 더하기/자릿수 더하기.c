#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int answer = 0;
    int len = 0;
    int tmp = n;
    
    while(tmp > 0)
    {
        tmp = tmp / 10;
        len++;
    }
    
    // 각자리수 더하는 Logic
    for(int i =0; i < len; i++)
    {
        answer += n % 10;
        n = n / 10;
    }
    
    return answer;
}