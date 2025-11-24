import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // 줄 수 입력
        int num = scan.nextInt();

        for(int i = 1; i <= num; i++){
            for (int j = 1; j <= num - i; j++) {    // 공백 출력
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {          // 별 출력
                System.out.print("*");
            }
            System.out.println();                    // 줄바꿈
        }
    }
}
