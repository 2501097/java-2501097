import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // 준비물
        Scanner keyboard = new Scanner(System.in);
        int first;
        int second;
        int result;

        // Data 입력
        System.out.print("첫번째 정수 입력 : ");
        first = keyboard.nextInt();
        System.out.print("두번째 정수 입력 : ");
        second = keyboard.nextInt();

        // 처리
        result = first * second;


        // Information 출력 (필수)
        System.out.printf("%,d * %,d = %,d\n", first, second, result);


    }
}