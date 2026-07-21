// 뒤에 오는 원소값이 다른 값이 오면 add
// 마지막 처리를 어떻게? 테스트 케이스 추가해보자
// 일단 i-1 까지 해보는걸로

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        answer.add(arr[0]);
        for(int i =0; i< arr.length - 1; i++)
        {
            if(arr[i] != arr[i+1])
            {
                answer.add(arr[i+1]);
            }
        }
        
        int[] ans = new int[answer.size()];
        for(int i = 0 ; i < answer.size(); i++)
        {
            ans[i] = answer.get(i);
        }
        return ans;
    }
}