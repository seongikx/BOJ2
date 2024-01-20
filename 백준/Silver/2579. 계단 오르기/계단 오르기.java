import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[][] ans = new int[a + 1][2];
        ans[1][0] = arr[0];
        ans[1][1] = arr[0];

        for (int i = 2; i <= a; i++) {
            ans[i][0] = Math.max(ans[i - 2][0], ans[i - 2][1]) + arr[i - 1];
            ans[i][1] = ans[i - 1][0] + arr[i - 1];
        }

        System.out.println(Math.max(ans[a][0], ans[a][1]));
    }
}
