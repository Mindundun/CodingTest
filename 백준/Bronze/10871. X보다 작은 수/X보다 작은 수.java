import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st1.nextToken());
        int X = Integer.parseInt(st1.nextToken());

        StringBuilder sb = new StringBuilder();

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < N; i++){
            
            int target_num = Integer.parseInt(st2.nextToken());
            if (X > target_num) {
                sb.append(target_num).append(" ");
            }
        }

        System.out.println(sb);
    }
    
}
