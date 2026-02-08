import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 받을 개수
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        long sum = 0;
        long max = 0;

        // 입력받은 수 덧셈
        for( int i = 0; i < n; i++){
            if (arr[i] > max) max = arr[i];
            sum += arr[i];
        }

        // 출력
        System.out.println(sum * 100.0 / max / n);
    }
}