import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int A,B,result;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        if(0<A && B<10){
            result = A+B;
            System.out.println(result);}
    }
}