import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 사용자 입력을 위한 Scanner 생성

        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine(); // 사용자로부터 문자열 입력 받기

        System.out.println("안녕하세요, " + name + "님!");

        scanner.close(); // 자원 정리
    }
}

