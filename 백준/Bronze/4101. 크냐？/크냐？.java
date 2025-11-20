import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            // 입력 받은 값이 둘다 0이라면 중지.
            if (A == 0 && B == 0) break;
            // 첫번째 수가 두번째 수보다 크면 Yes, 아니면 No
            if (A > B) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            } 
        }
    }    
}