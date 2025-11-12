import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int hap = 0;

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        for(int i = 1; i <= num; i++){
            hap += i;
        }

        System.out.print(hap);
    }
}