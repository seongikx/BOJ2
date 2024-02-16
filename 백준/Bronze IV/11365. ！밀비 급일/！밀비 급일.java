import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(;;){
            String str = sc.nextLine();
            if(str.equals("END"))break;

            StringBuffer sb = new StringBuffer(str);
            String str2 = sb.reverse().toString();
            System.out.println(str2);
        }
    }
}