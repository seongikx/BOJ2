import java.util.Scanner;

public class Main
{ public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<t;i++){
            String a = sc.nextLine();
            char[] arr = new char[a.length()];
            int count =0;
            int ans = 0;
            for(int j=0;j<a.length();j++)
              {arr[j] = a.charAt(j);
                    if(arr[j]=='O'){
                      ++count;
                      ans += count;
                    }else if(arr[j]=='X')count = 0;
              }
            System.out.println(ans);
        }
    }
}