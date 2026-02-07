import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 받을 개수
        int n = Integer.parseInt(br.readLine());

        // 위의 n 개를 공백 없이 입력 받고 문자형 배열에 넣음
        String str = br.readLine();
        char[] CArr = str.toCharArray();

        int sum = 0;

        // 입력받은 수 덧셈
        for(int i = 0; i < n; i++){
            sum += CArr[i] - '0';
        }
        
        // 출력
        System.out.println(sum);
    }
}
