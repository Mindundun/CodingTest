import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성
        int[] chess = {1, 1, 2, 2, 2, 8};

        // 입력은 한줄로 띄어쓰기를 구분하여 받음.
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 출력을 위한 StringBuilder
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < chess.length; i++){
            // 킹, 퀸, 룩 .. 순서대로 필요한 숫자를 구함
            sb.append(chess[i] - Integer.parseInt(st.nextToken())).append(" ");
        }
        System.out.println(sb);

    }
    
}
