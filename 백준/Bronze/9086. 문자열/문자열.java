import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        String[] arr = new String[num];

        // 입력받은 문자열을 배열에 담는다.
        for(int i = 0; i < arr.length; i++){
            arr[i] = br.readLine();
        }

        for(int i = 0; i < arr.length; i++){
            // 입력받은 문자열의 첫글자와 마지막글자를 문자열로 붙임.
            // char + char는 숫자라서 앞에 ""를 더해 문자열처리로써 문자를 붙임
            System.out.println("" + arr[i].charAt(0) + arr[i].charAt(arr[i].length() -1));
        }     
    }
    
}