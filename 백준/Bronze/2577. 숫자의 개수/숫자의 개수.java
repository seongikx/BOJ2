import java.util.Scanner;

public class Main
{ public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String ans = String.valueOf(a*b*c);
        int[] arr = new int[10];

        for(int i=0; i<ans.length();i++){
            arr[ans.charAt(i)-'0']++;
        }
        for(int j=0; j<10; j++){
            System.out.println(arr[j]);
        }
    }
}