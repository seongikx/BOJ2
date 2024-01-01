import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int max= 0,min = 0;

        for(int i = 0; i<a ; i++) {
            int b = sc.nextInt();
            if(i==0){
                min = b;
                max = b;
            }
            if(b>max){
                max = b;
            }else if(b<min){
                min = b;
            }
        }
        System.out.println(min+" "+max);
    }
}
