import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[26];
        Arrays.fill(arr,-1);
        String str = sc.next();

        for(int i=0;i<str.length();i++) {
           if(i>arr[str.charAt(i)-'a']&&arr[str.charAt(i)-'a']!=-1) continue;
           else arr[str.charAt(i)-'a'] = i;
        }

        for(int i =0;i<26;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

