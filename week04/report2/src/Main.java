//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int totalAmount;  // 판매금액
        int amount;       // 순수 금액
        int vat;          // 세금(부가가치세)

        System.out.print("판매금액을 입력하세요: ");
        totalAmount = keyboard.nextInt();

        vat = totalAmount / 11;
        amount = totalAmount - vat;

        System.out.println(">>>>>> 계산 결과 <<<<<<");
        System.out.printf("\t금액 : %,d 원\n", amount);
        System.out.printf("\t세금 : %,d 원\n", vat);
    }
}