import java.util.*;

public class Main_2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while(t-->0){
            int n = cin.nextInt();
            for(int i=1;i<=n/2;i++){
                if(n%i==0){
                    int b = n/i;
                    if(jude(i,b)){
                        System.out.println("Yes");
                        break;
                    }
                }
                if(i>=n/2){
                    System.out.println("No");
                    break;
                }
            }
        }
        cin.close();
    }

    private static boolean jude(int n, int b) {
        int i;
        int tmp1 = 0 , tmp2 = 0;
        for(i=2;i<n;i++){
            if(n%i==0) break;
        }
        if(i==n) tmp1 = 1;

        for(i=2;i<b;i++){
            if(b%i==0) break;
        }
        if(i==b) tmp2 = 1;

        if(tmp1==1 && tmp2==1) return true;
        else   return false;
    }
}
