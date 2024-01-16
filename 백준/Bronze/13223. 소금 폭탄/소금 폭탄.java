import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String[] current = sc.nextLine().split(":");
        int chour = Integer.parseInt(current[0]);
        int cmin = Integer.parseInt(current[1]);
        int csec = Integer.parseInt(current[2]);

        String[] use = sc.nextLine().split(":");
        int uhour = Integer.parseInt(use[0]);
        int umin = Integer.parseInt(use[1]);
        int usec = Integer.parseInt(use[2]);

        int need = (uhour*3600 + umin*60+usec) - (chour * 3600 + cmin * 60 + csec);
        if(need<=0) need += 24*3600;

        int nhour = need / 3600;
        int nmin = (need % 3600) / 60;
        int nsec = need%60;

        System.out.printf("%02d:%02d:%02d",nhour,nmin,nsec);

    }
}