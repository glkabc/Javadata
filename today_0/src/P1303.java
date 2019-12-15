/**
 * @name:today
 * @time:2019.12.15
 * @ACM:小明A+B
 *
 */

import java.util.Scanner;

public class P1303 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        int sum = 0;
        if(a<10 && b<10){
            sum = (a+b)%10;
        }else if(a < 10){
            int tmp = b%10;
            a = (a+tmp)%10;
            b = b/10;
            sum = b*10 + a;
        }else if(b < 10){
            int tmp = a%10;
            b = (b+tmp)%10;
            a = a/10;
            sum = a*10+b;
        }else {
            int tmp1 = a%10;
            int tmp2 = b%10;
            a = a/10;
            b = b/10;
            sum = ((a+b)%10)*10+(tmp1+tmp2)%10;
        }
        System.out.println(sum);
        cin.close();
    }
}
