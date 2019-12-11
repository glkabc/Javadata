import java.util.*;

public class shuchu {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()) {
            int n = cin.nextInt();
            int m = cin.nextInt();
            List<Integer> quanlist = new LinkedList<>();//实例化一个链表对象
            for (int i = 0; i < n; i++) {
                quanlist.add(i + 1);
            }
            int tmp = -1;
            while (quanlist.size() > 1) {
                tmp = (tmp + m) % quanlist.size();
                quanlist.remove(tmp--);
            }
            System.out.println(quanlist.get(0));
        }//TODO
        cin.close();
    }
}
