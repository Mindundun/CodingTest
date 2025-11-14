import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        // 입력 받은 값은 String이기에 String에 대입
        String s = scan.next();

        // 형변환을 위해서 String의 첫번째 값을 char에 대입
        char c = s.charAt(0);

        // 아스키코드로 출력하기 위해 char형태를 integer로 출력
        System.out.println(Integer.valueOf(c));
    }
    
}