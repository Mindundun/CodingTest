import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = 0;

        for(int i = 1;i <= 5; i++){
            // 띄어쓰기 기준으로 값 변수에 대입
            int num = Integer.parseInt(st.nextToken());
            // 제곱한 수를 합계
            sum = sum + (num*num);
        }
        // 각 숫자의 제곱 합에 대해 10으로 나눈 나머지 출력
        System.out.println(sum % 10);
        
    }    
}
