import java.util.Scanner;

public class D1VarAndTypes {
    public static void main(String[] args) {

        // Scanner로 입력받기
        Scanner scanner = new Scanner(System.in);
        String scannedLine = scanner.nextLine();
        System.out.println(scannedLine);

// scanner.next<자료형>();
        int scannedInt = scanner.nextInt();
        long scannedLong = scanner.nextLong();
        System.out.println(scannedInt);
        System.out.println(scannedLong);

        float scannedFloat = scanner.nextFloat();
        double scannedDouble = scanner.nextDouble();
        System.out.println(scannedFloat);
        System.out.println(scannedDouble);

        boolean scannedBool = scanner.nextBoolean();
        System.out.println(scannedBool);


    }
}
