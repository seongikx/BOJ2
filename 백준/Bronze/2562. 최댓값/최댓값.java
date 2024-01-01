import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max= 0,check= 0;

        for(int i = 0; i<9 ; i++) {
            int b = sc.nextInt();
            if(i==0){
                max = b;
                check = 1;
            }
            if(b>max){
                max = b;
                check = i+1;
            }
        }
        System.out.println(max+"\n"+check);
    }
}
