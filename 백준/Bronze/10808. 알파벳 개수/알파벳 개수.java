import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        int[] arr = new int[26];

        for(int i = 0; i < str.length(); i++){
            arr[str.charAt(i) - 97] ++;
        }

        for(int count : arr){
            System.out.print(count + " ");
        }
    }
    
}