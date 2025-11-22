import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        
        for(int i = 0; i < st.length();i++){
            if(st.charAt(i) >= 'a' && st.charAt(i) <= 'z') {
                System.out.print((char)(st.charAt(i) - 32));
            } else if(st.charAt(i) >= 'A' && st.charAt(i) <= 'Z') {
                System.out.print((char)(st.charAt(i) + 32));
            } else {
                System.out.print(st.charAt(i)); // 숫자, 특수문자는 그대로
            }
        }
    }
}