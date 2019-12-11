import java.util.Scanner;
public class java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double a0 = sc.nextDouble();
        double an1 = sc.nextDouble();
        double tot = 0.0, ans = 0.0;
        for (int i = 1; i <= N; i++) {
            double cn = sc.nextDouble();
            tot += 2.0 * (N + 1 - i) * cn;
            ans = N * a0 + an1 - tot;
        }
        System.out.println(String.format("%.2f", ans / (N + 1)));
    }
}
