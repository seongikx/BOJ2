import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String time = br.readLine();
        StringTokenizer st = new StringTokenizer(time);
        int hour = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());

        if(count - 45 <0&&hour >= 1){
            System.out.println(hour-1+" "+(60+(count-45)));
        }else if ( count - 45 < 0 && hour ==0){
            System.out.println(23+" "+(60+(count-45)));
        }else System.out.println(hour+" "+(count-45));
    }
}