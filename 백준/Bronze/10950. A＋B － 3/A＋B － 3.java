import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws Exception{
        // 빠른 입력을 받기 위함
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 받은 입력값을 int형으로 변환 후 변수에 대입
        int num = Integer.parseInt(br.readLine());
        // 출력을 받기위한 StringBuilder
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < num; i++){
            // Line 문자열을 공백 기준으로 나눔
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            // 나뉜 문자를 넣음
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            sb.append(A+B).append("\n");
        }
        
        System.out.println(sb);

    }
}
