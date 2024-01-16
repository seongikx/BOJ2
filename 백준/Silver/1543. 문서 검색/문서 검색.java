import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String doc = sc.nextLine();
        String word = sc.nextLine();

        int start = 0;
        int count = 0;

        while(true){
            int findindex = doc.indexOf(word,start);
            if(findindex<0) break;
            count ++;
            start = findindex + word.length();
        }
        System.out.println(count);
    }
}