import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        int[] arr2 = new int[2];
        int result = 0;

        for(int i = 0; i<6; i++){
            if(i<=3){
                arr[i] = sc.nextInt();
            }
            else if(3<i){
                arr2[i-4] = sc.nextInt();
            }
        }
        Arrays.sort(arr);
        for(int i = 1;i<4; i++){
            result += arr[i];
        }
        result += Math.max(arr2[0],arr2[1]);
        System.out.println(result);
    }
}