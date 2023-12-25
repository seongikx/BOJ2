import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int index,sum = 0;

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<5;i++){
            index = sc.nextInt();
            sum += index * index;
        }
        int result = sum % 10;
        System.out.println(result);

    }

}