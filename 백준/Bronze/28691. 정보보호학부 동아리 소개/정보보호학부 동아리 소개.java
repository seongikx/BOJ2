import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        if(a=='M') System.out.println("MatKor");
        else if (a=='W') System.out.println("WiCys");
        else if (a=='C') System.out.println("CyKor");
        else if (a=='A') System.out.println("AlKor");
        else if (a=='$') System.out.println("$clear");
    }
}