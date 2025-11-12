import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("나이를 입력하세요 : ");
        int age = keyboard.nextInt();
        int price = (age >= 10) ? 4000 :
                (age >= 13) ? 3000 :
                        (age >= 7) ? 1000 : 0;
        System.out.println("입장료는 " + price + "원 입니다.");
    }
}