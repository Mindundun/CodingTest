import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        // 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 띄어쓰기 기준으로 자르기
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 첫번째 도메인의 유명도 입력 받기
        long N = Integer.parseInt(st.nextToken());
        // 두번째 도메인의 유명도 입력 받기
        long M = Integer.parseInt(st.nextToken());
        // 두 도메인의 유명도 차이 출력(절댓값)
        System.out.print(Math.abs(N-M));
    }
}
