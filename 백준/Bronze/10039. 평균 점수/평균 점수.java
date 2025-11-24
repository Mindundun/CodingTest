import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int totalScore = 0;

        for(int i = 0; i < 5; i++){
            int score = Integer.parseInt(br.readLine());
            totalScore += score >= 40 ? score : 40;
        }

        System.out.print(totalScore / 5);
    }
    
}
