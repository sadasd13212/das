import java.util.Scanner;

public class D3ControlStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //
        int age = scanner.nextInt();
        if (age < 20) {
            System.out.println("입장불가");
            System.out.println(String.format("%d년 뒤에 오세요", 20 - age));
        }
        int multiple = scanner.nextInt();
        if (multiple % 2 == 0) {
            System.out.println("2의 배수");
        }
        if (multiple % 5 == 0) {
            System.out.println("5의 배수");
        }
        if (multiple % 10 == 0) {
            System.out.println("10의 배수");
        }

        int Year=scanner.nextInt();
        if (Year==0){
            if(Year!=100){
                System.out.println("유년이다.");
            }
            if(Year==400){
                System.out.println("유년이다.");
            }
        }
        int number=10;
        if (number % 2==0){
            System.out.println("짝수");
        }else {
            System.out.println("홀수");
        }

        int a =scanner.nextInt();
            if(a>80){
                System.out.println("GoodJob");
            }else System.out.println("TooBad");
    }
}
