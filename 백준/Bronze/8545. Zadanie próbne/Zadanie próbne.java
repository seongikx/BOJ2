import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b ="";
        for(int i =2; i>-1; i--){
            b = b+a.charAt(i);
        }
        System.out.println(b);

    }
}