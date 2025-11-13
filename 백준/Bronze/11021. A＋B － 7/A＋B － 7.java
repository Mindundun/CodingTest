import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 줄에 합계 갯수 입력 받기
        int N = Integer.parseInt(br.readLine());

        // 출력할 변수 담기
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            sb.append("Case #").append(i).append(": ").append(A + B).append("\n");
        }
        System.out.print(sb);

    }
    
}
