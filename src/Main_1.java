import java.util.Arrays;
import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while (t-->0){
            int n = cin.nextInt();
            int []ary = new int[n];
            for(int i=0;i<n;i++) ary[i] = cin.nextInt();
            int m = cin.nextInt();
            int []ary1 = new int[m];
            for(int i=0;i<m;i++) ary1[i] = cin.nextInt();

            Arrays.sort(ary);
            for(int i=0;i<m;i++){
                int tmp = ary1[i];
                for(int j=0;j<n;j++){
                    if(tmp < ary[j]) break;
                    tmp = tmp%ary[j];
                    }
                System.out.println(tmp);
            }
        }
        cin.close();
    }
}
