import java.io.*;
import java.util.*;
import java.math.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 정수 개수
        int arr[] = new int[n];

        String[] tokens = br.readLine().split(" "); // 숫자들을 공백으로 나눔

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(tokens[i]);
        }
        
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            else if(arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println(min + " " + max);

    }
}