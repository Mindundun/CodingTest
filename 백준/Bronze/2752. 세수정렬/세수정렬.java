import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        // 세 수 비교 및 정렬 
        if(A > B) { int tmp = A; A = B; B = tmp; }
        if(A > C) { int tmp = A; A = C; C = tmp; }
        if(B > C) { int tmp = B; B = C; C = tmp; }

        System.out.println(A + " " + B + " " + C);

    }    
}
