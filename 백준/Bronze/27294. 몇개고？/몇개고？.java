import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(b==1 || (a<12||a>16)) System.out.println("280");
        else System.out.println("320");
    }
}
