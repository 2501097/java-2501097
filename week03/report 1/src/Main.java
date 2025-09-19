import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int first = 0;
        int second = 0;

        System.out.printf("첫번째 숫자를 입력하세요", first);
        first = keyboard.nextInt();

        System.out.printf("두번째 숫자를 입력하세요", second);
        second = keyboard.nextInt();

        int result = first + second;

        System.out.printf("%d + %d = %d", first, second, result);
    }
}