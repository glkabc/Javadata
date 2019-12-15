/**
 * @name:today
 * @time:2019.12.15
 * @ACM:水题
 *
 */

import java.util.Scanner;

public class P1175 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()){
            int a = cin.nextInt();
            int b = cin.nextInt();
            if(a==0 && b==0) break;
            int sum = 0;
            for(int i=a;i<=b;i++){
                sum += i;
            }
            System.out.println(sum);
        }
        cin.close();
    }
}
