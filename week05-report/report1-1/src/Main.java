
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("영문자 1자를 입력하세요: ");
        String input = keyboard.next();
        char ch = input.charAt(0);

        String result = (ch >= 'a' && ch <= 'z') ? "대문자로 변환: " + (char)(ch - 32) :
                (ch >= 'A' && ch <= 'Z') ? "소문자로 변환: " + (char)(ch + 32) :
                        "영문자가 아닙니다.";

        System.out.println(result);
    }
}