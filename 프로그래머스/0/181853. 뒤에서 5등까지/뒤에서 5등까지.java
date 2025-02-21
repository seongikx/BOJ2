import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = num_list;
        Arrays.sort(answer);
        
        int[] ans = new int[5];
        for(int i = 0; i < 5; i++)
        {
            ans[i] = answer[i];
        }
        return ans;
    }
}