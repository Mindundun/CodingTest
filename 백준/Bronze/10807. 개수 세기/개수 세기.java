import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력받을 숫자열의 갯수
        int num = Integer.parseInt(br.readLine());
        // 숫자열 입력받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 찾을 숫자
        int target_num = Integer.parseInt(br.readLine());
        
        int result = 0;

        // 입력받은 숫자를 input_arr에 넣기
        for(int i = 0; i < num; i++){
            int input_num = Integer.parseInt(st.nextToken());        
            if (target_num == input_num){
                result ++;
            }
        }

        System.out.print(result);

    }
}
