import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = 2;
        String aa = Integer.toBinaryString(a);
        System.out.println(aa);
        binaryToDecimal(a);
        cin.close();
    }
    private static void binaryToDecimal(int n){
        for(int i = 31;i >= 0; i--)
            System.out.print(n >>> i & 1);
    }
}