/*
*  name:today
*  time:2019.12.14
*  ACM:N的第一位
* */

import java.math.BigInteger;
import java.util.Scanner;

public class P1557 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        while (n-->0){
            BigInteger a = cin.nextBigInteger();
            String str = String.valueOf(a);
            System.out.println(str.charAt(0));
        }
        cin.close();
    }
}
