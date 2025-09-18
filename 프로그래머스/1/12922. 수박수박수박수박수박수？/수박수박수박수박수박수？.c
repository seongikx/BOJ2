#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

char* solution(int n) {
    const char* SU = "수";
    const char* BAK = "박";
    size_t L = strlen(SU);
    char* answer = malloc(L * n + 1);
    answer[0] = '\0';

    for(int i = 0; i<n; i++)
    {
        if( (i+1) %2 == 0)
            strcat(answer,"박");
        else
            strcat(answer,"수");
    }
    return answer;
}