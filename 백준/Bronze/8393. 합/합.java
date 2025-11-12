import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception{

        int hap = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        

        int num = Integer.parseInt(br.readLine());


        for(int i = 1; i <= num; i++){
            hap += i;
        }

        System.out.print(hap);
    }
}
