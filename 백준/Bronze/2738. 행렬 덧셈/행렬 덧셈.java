import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 행렬의 행과 열을 받음
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        // 입력 받은 행과 열 기준으로 2차원 배열을 만듬
        int[][] arr = new int[N][M];

        // 처음 입력받은 행렬 값을 담음
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 첫 번째 행렬에 두번째 행렬 값을 더함
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                arr[i][j] = arr[i][j] + Integer.parseInt(st.nextToken());
            }
        }

        // 출력
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
