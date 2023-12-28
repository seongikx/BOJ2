import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        double[] numbers = new double[a];
        double sum = 0.0;

        for(int i=0;i<a;i++) numbers[i] = sc.nextDouble();

        double max = Arrays.stream(numbers).max().getAsDouble();
        for(int x=0;x<a;x++)  sum += numbers[x] / max * 100;

        System.out.println(sum/a);
    }
}