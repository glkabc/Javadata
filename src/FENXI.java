import java.math.BigDecimal;
import java.util.Scanner;

public class FENXI {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()){
            double a[] = new double[10];
            double sum1 = 0.0;
            double sum2 = 0.0;
            double sum = 0.0;
            for(int i=0;i<a.length;i++){
                a[i] = cin.nextDouble();
            }
            sum1 = 0.216*a[0]+0.161*a[1]+0.082*a[2]+0.334*a[3]-0.037*a[4]+0.026*a[5]+0.309*a[6]+0.146*a[7]-0.324*a[8]-0.091*a[9];
            sum2 = -0.070*a[0]-0.001*a[1]+0.097*a[2]-0.254*a[3]+0.231*a[4]+0.158*a[5]-0.198*a[6]-0.012*a[7]+0.295*a[8]+0.525*a[9];
            sum = (0.51130/0.89893)*sum1 + (0.38763/0.89893)*sum2;
            System.out.println(sum);
            System.out.println(sum1);
            System.out.println(sum2);
            System.out.println(0.51130/0.89893);
            System.out.println(0.38763/0.89893);
        }
    }
}
