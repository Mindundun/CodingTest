import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		scan.nextLine();
		String arr[] = new String[num+1];
		
		//배열 입력
		for(int i = 0 ; i < num; i++) {
			arr[i] = scan.nextLine();
		}
		//배열 출력
		for(int i = 0 ; i < num; i++) {	
			System.out.println(arr[i].charAt(0) + "" + arr[i].charAt(arr[i].length()-1));
		}
		scan.close();
	}
}