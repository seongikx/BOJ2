import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.StringTokenizer;


public class Main {
    public static int i = 1;
    public static int start = 666;

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(sc.readLine()); //숫자 입력받기
        for(;;) {
            if(six(start)==1){
                if(i==a){
                    break;
                }else i++;
            }
            start ++;
        }
        System.out.println(start);
        }

    public static int six(int a){
        int check = 0;
        while(a>0){
            if(a%10==6){
                check++;
            }else{
                check =0;
            }if(check==3){
                return 1;
            }
            a = (int)Math.floor(a/10);
        }
        return 0;
    }
}
