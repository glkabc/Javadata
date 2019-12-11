import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n = cin.nextInt();
        int tmp = 0;
        int i,j;
        while (n-->=0){
            String  a = cin.nextLine();
            //System.out.printf("%s\n",a);
            for(j=0;j<a.length()-1;j++){
                if(a.charAt(j) == '1' && a.charAt(j+1) == '3'){
                    System.out.printf("Case #%d: No, it's terrible!\n",++tmp);
                    break;
                }

                if(j==a.length()-2){
                    System.out.printf("Case #%d: Yes, I like it!\n",++tmp);
                    break;
                }
            }
        }
        cin.close();
    }
}