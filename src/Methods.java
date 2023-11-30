import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a = scanner.nextInt();
        int sum=scanner.nextInt();
        int goal= scanner.nextInt();

        int maxscore=sum*a*3;
        if(maxscore>goal){

        }else{
            System.out.println(String.format("최대 승점 %d",maxscore));
        }
    }
}

