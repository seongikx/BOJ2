import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos = 0;
        int n = sc.nextInt();
        for(int i = 0 ; i<n; i++){
            int a = sc.nextInt();
            pos += a;
        }
        if(pos<0)System.out.println("Left");
        else if(pos==0) System.out.println("Stay");
        else if(pos>0) System.out.println("Right");
    }
}