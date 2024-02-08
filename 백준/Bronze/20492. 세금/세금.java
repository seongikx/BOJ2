import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = (int)(a*0.78);
        int c = (int)(a-((a*0.20)*0.22));
        System.out.println(b+" "+c);
    }
}