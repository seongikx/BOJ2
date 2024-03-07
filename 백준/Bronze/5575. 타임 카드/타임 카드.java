import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0 ; i<3 ; i++){
            int a = sc.nextInt(), b = sc.nextInt(),c = sc.nextInt();
            int d = sc.nextInt(), e = sc.nextInt(),f = sc.nextInt();

            int start = a*3600+b*60+c;
            int end = d*3600+e*60+f;

            int res = end-start;
            // 시 = res /3600 , 분 = res % 60 초

            System.out.println(res/3600 +" "+(res%3600)/60+ " "+(res%3600)%60);

        }
    }
}