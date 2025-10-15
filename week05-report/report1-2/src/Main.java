import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int ch; // 입력 문자를 위한 변수 선언

        System.out.print("문자 입력: ");
        ch = keyboard.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') { // 소문자일 경우
            System.out.printf("입력문자 %c는 소문자이고, 대문자로 변경하면 %c 입니다.\n", ch, (char)(ch - 32));
        } else if (ch >= 'A' && ch <= 'Z') { // 대문자일 경우
            System.out.printf("입력문자 %c는 대문자이고, 소문자로 변경하면 %c 입니다.\n", ch, (char)(ch + 32));
        } else { // 그 외의 경우
            System.out.println("영문자가 아닙니다.");
        }

        keyboard.close();
    }
}