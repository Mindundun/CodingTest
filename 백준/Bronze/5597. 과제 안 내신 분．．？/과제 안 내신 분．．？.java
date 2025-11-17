import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws Exception{

        // 30 짜리 빈 배열 생성
        int[] arr = new int[30];

        // 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 받은 숫자를 해당하는 배열에 넣음
        for(int i = 0; i < 28; i++){
            int num = Integer.parseInt(br.readLine());
            arr[num - 1] = 1;

        }
        // 배열에 값이 없으면 해당 숫자 출력
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 1){
                System.out.println(i + 1);
            }
        }
    }    
}
