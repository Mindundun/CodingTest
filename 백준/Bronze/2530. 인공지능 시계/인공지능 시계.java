import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int sec = Integer.parseInt(st.nextToken());

        int cookingTime = Integer.parseInt(br.readLine());

        // 총 초로 변환
        int totalSec = hour * 3600 + min * 60 + sec + cookingTime;

        // 시, 분, 초로 다시 변환
        hour = (totalSec / 3600) % 24; // 24시간 기준
        min = (totalSec % 3600) / 60;
        sec = totalSec % 60;

        System.out.println(hour + " " + min + " " + sec);
    }
    
}
