import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class Q1Cotrol {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int n = Scanner.nextInt();
        if (1<=n&&n<=26){
            System.out.println((char) (64+n));
        }
        int dust = 15;
        if(dust<=30){
            System.out.println("좋음");
        }else if(30<dust&&dust<=80){
            System.out.println("보통");
        } else if (80<dust&&dust<=150) {
            System.out.println("나쁨");

        }else {
            System.out.println("매우나쁨");
        }

    }

}