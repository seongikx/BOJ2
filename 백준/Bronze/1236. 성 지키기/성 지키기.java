import java.util.Scanner;

public class Main
{ public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();
    char[][] map = new char[N][M];
    for(int i =0; i<N; i++){
        map[i] = sc.next().toCharArray();
    }
    boolean[] isRowX = new boolean[N];
    boolean[] isColX = new boolean[M];

    for(int i =0; i<N; i++){
        for(int j=0; j<M; j++){
            if(map[i][j]=='X'){
                isRowX[i] = true;
                isColX[j] = true;
            }
        }
    }
    int Xrow = N;
    int Xcol = M;
    for(int i=0;i<N;i++)if(isRowX[i])Xrow--;
    for(int i=0;i<M;i++)if(isColX[i])Xcol--;
    System.out.println(Math.max(Xrow,Xcol));
    }
}