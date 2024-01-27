import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();

    if(620<= a && a <= 780) System.out.println("Red");
    else if(590<= a && a < 620) System.out.println("Orange");
    else if(570<= a && a < 590) System.out.println("Yellow");
    else if(495<= a && a < 570) System.out.println("Green");
    else if(450<= a && a < 495) System.out.println("Blue");
    else if(425<= a && a < 450) System.out.println("Indigo");
    else if(380<= a && a < 425) System.out.println("Violet");
    }
}