import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int sum = a;
       for(int i = a-1 ; i>0; i--){
           sum = sum * i;
       }
       if(sum==0) System.out.println("1");
       else System.out.println(sum);
    }
}