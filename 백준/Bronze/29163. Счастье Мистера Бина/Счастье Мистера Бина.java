import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int even =0 , odd = 0;

        for(int i = 0; i<a; i++){
            int b = sc.nextInt();
            if(b%2==0)even++;
            else odd ++;
        }
        if(even>odd) System.out.println("Happy");
        else System.out.println("Sad");
    }
}