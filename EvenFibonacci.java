package ProjectEuler;

import java.util.Scanner;

public class EvenFibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int lim =4000000;
        int a=1;
        int b=1;
        int c=a+b;
        int sum2=0;
        while(c<lim){
            sum2+=c;

            a=b+c;
            b=c+a;
            c=a+b;

        }
        System.out.println(sum2);
    }
}
