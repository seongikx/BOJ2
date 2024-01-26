import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        if(Integer.toString(a).contains("7")){
            if(a % 7 == 0){
                bw.write(3+"\n");
            }else bw.write(2+"\n");
        }else{
            if(a % 7 == 0){
                bw.write(1+"\n");
            }else bw.write(0+"\n");
        }

        bw.flush();

    }
}