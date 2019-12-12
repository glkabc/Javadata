/*
 *  name:today
 *  time:2019.12.12
 *  ACM:集合分配
 */
import java.util.Scanner;

public class ji_he {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()){
            int n = cin.nextInt();
            int m = cin.nextInt();
            if(m<=n/2){
                System.out.println(jie_cheng_2(n,m)/jie_cheng(m));
            }else{
                System.out.println(jie_cheng_2(n,n-m)/jie_cheng(n-m));
            }
        }
        cin.close();
    }

    private static long jie_cheng_2(int n, int m) {
        long   sum=1;
        int k=0;
        for(int i=n;k<m;i--,k++){
            sum *=i;
        }
        return sum;
    }

    private static long jie_cheng(int m) {
        long sum=1;
        for(int i=1;i<=m;i++){
            sum*=i;
        }
        return sum;
    }
}
