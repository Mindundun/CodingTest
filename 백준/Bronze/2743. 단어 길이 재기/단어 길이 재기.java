import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws Exception {
        // 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 받은 문자열 길이 출력 
        System.out.print(br.readLine().length());
    }
}
