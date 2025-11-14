import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        // 문제에서 요구하는 출력형태 : 입력값 + "??!"
        System.out.print(s + "??!");
    }
    
}
