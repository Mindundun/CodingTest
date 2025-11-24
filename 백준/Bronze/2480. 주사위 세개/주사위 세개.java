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

        if ((A == B) && (A == C)){
            System.out.print(10000 + A * 1000);
        } else if (((A == B) && (A != C)) || ((B == C) && (B != A)) || ((A == C) && (A != B))){
            System.out.print(1000 + (A==B?A:C) * 100);
        } else {
            System.out.print(Math.max(Math.max(A, B), C) * 100);
        }
    }
}
