import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String time = br.readLine();
        String clock = br.readLine();
        StringTokenizer st = new StringTokenizer(time);

        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int timer = Integer.parseInt(clock);

        int pt = timer / 60;
        int pm = timer % 60;

        if (hour+pt <= 23 && min +pm < 60) System.out.println((hour+pt)+" "+(min+pm));
        else if(hour+pt < 23 && min + pm >= 60) System.out.println((hour+pt+1)+" "+(min+pm-60));
        else if(hour+pt == 23 && min + pm >= 60) System.out.println(0+" "+(min+pm-60));
        else if(hour+pt>=24 && min + pm <= 60) System.out.println((hour+pt-24)+" "+(min+pm));
        else if(hour+pt>=24 && min + pm >= 60) System.out.println((hour+pt-23)+" "+(min+pm-60));

    }
}