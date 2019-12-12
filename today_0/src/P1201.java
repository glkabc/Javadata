/*
*  by:today
*  time:2019.12.12
*  name:ACM 1201 被3和5整除的数
* */
import java.util.Scanner;

public class P1201 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int m = cin.nextInt();
        int n = cin.nextInt();
        int num_sum = 0;
        for(int i=m;i<=n;i++){
            if(i%3==0 && i%5==0){
                num_sum++;
            }
        }
        System.out.println(num_sum);
        cin.close();
    }
}
