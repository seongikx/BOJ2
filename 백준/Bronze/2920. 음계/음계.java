import java.util.Scanner;

public class Main
{ public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[8];
        boolean isgood = false;
        boolean isno = false;

        for(int i=0;i<8;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<7;i++){
           if(arr[i]>arr[i+1]) isno = true;
           else if(arr[i]<arr[i+1]) isgood = true;
        }
        if(isgood&&isno) System.out.println("mixed");
        else if(isno==false&&isgood==false) System.out.println("mixed");
        else if(isgood) System.out.println("ascending");
        else if(isno)System.out.println("descending");
    }
}