import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;

        while (sc.hasNext()){
            int a = sc.nextInt();
            if(a==0)break;
            for(int i = 0; i<a;i++){
                int trash = sc.nextInt();
                if(i==a-1){
                    cnt++;
                    System.out.println("Case "+cnt+": Sorting... done!");
                }
            }

        }
    }
}