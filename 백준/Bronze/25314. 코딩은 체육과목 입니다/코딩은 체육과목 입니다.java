import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // 입력 받기
        Scanner scan = new Scanner(System.in);
        // 입력 받은 수 int형으로 변환 및 대입
        int num = scan.nextInt();

        // 입력 받은 수 / 4를 하여 long 반복
        for(int i = 1; i <= num/4; i++){
            System.out.print("long ");
        }
        // 마지막 출력에는 int 출력
        System.out.print("int");
    }
    
}
