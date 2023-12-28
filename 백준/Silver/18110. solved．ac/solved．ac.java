import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
       // Scanner sc = new Scanner(System.in);
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));


        int a = Integer.parseInt(sc.readLine()); //난이도 의견 개수
        int[] numbers = new int[a]; //난이도 의견
        double sum = 0.0;

        for(int i=0;i<a;i++) numbers[i] = Integer.parseInt(sc.readLine()); //난이도 의견 입력

        Arrays.sort(numbers);
        int slice = (int)Math.round(a*0.15);

        for(int b=slice;b<a-slice;b++){
            sum += numbers[b];
        }

        System.out.println(Math.round(sum/((a-slice)-slice)));
    }
}