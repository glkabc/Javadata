/*求质数*/
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int i;
        for(i=2;i<a;i++){
            if(a%i==0) break;
        }
        if(a == 1) System.out.println("Y");
        else if(i==a) System.out.println("Y");
        else System.out.println("N");
        cin.close();
    }
}