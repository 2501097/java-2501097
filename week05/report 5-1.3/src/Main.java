import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("문자 1자를 입력하세요: ");
        String input = keyboard.next();

        if (input.length() != 1) {
            System.out.println("문자 1자만 입력해야 합니다.");
            return;
        }

        char ch = input.charAt(0);

        if (!( (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') )) {
            // 영문자가 아닌 경우
            System.out.println("영문자가 아닙니다.");
        } else {
// 영문자인 경우
            if (ch >= 'a' && ch <= 'z') {
// 소문자를 대문자로 변환
                char convertedChar = (char)(ch - 32);
                System.out.printf("입력문자 %c는 소문자이고, 대문자로 변경하면 %c 입니다.\n", ch, convertedChar);
            } else {
// 대문자를 소문자로 변환
                char convertedChar = (char)(ch + 32);
                System.out.printf("입력문자 %c는 대문자이고, 소문자로 변경하면 %c 입니다.\n", ch, convertedChar);
            }
        }
        keyboard.close();
    }
}
