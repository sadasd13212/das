import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
// 몇개의 정수가 입력될지 n에 저장되어 있다.
// 즉 n번 반복해서 입력을 받으면 된다.
        for (int i = 0; i < n; i++) {
            sum += scanner.nextInt();
        }
        System.out.println(sum);
        System.out.println((double) sum / n);
    }
}
