import java.util.Scanner;

public class Main
{ public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    while(sc.hasNext()){
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a==0&&b==0)break;
        else if(a>b) System.out.println("Yes");
        else if(b>a) System.out.println("No");
        else if(a==b) System.out.println("No");
    }

    }
}