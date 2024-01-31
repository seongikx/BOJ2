import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        int[][] ans = new int[n][m];

        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[i][j] = sc.nextInt();
            }
        }
        for(int i =0;i<n;i++){
            if(i>0) System.out.println();
            for(int j=0;j<m;j++){
                ans[i][j] += arr[i][j];
                System.out.print(ans[i][j]+" ");
            }
        }
    }
}