import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        while(sc.hasNext()){
            String a = sc.nextLine();
            cnt++;
        }
        System.out.println(cnt);
    }
}