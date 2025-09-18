#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(long long n) {
    
    long long tmp = n;
    int len =0;
    
    while(tmp>0)
    {
        tmp /= 10;
        len ++;
    }

    int* answer = (int*)malloc(sizeof(int)*(len+1));
    
    for(int i =0; i < len ; i++)
    {
        answer[i] = (int)(n % 10);
        n /= 10;
    }
    return answer;
}