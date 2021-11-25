package co.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int o=0;
        int f=0;
        for (int i = 2; i < (n/2+1); i++) {
            f=1;
            for (int j = 2; j < i/2+1; j++) {
                if (i%j==0)
                f=0;
            }
            for(int j=2;j<(n-i)/2+1;j++){
                if ((n-i)%j==0)
                f=0;
            }
            if(f==1){
                o=1;
                break;
            }
        }

        if(o==1)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
