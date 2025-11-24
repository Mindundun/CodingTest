import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int buggerAPrice = Integer.parseInt(br.readLine());
        int buggerBPrice = Integer.parseInt(br.readLine());
        int buggerCPrice = Integer.parseInt(br.readLine());
        int drinkAPrice = Integer.parseInt(br.readLine());
        int drinkBPrice = Integer.parseInt(br.readLine());

        System.out.print(Math.min(Math.min(buggerAPrice, buggerBPrice),buggerCPrice) + Math.min(drinkAPrice, drinkBPrice) - 50);
    }

}