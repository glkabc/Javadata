/*
 *  name:today
 *  time:2019.12.11
 *  ACM:1097-字符串反转问题
 */
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str = cin.nextLine();
        Stack<Character> a = new Stack<>();
        for(int i=0;i<str.length();i++){
            a.push(str.charAt(i));
        }
        while (!a.isEmpty()){
            System.out.print(a.pop());
        }

    }
}
