//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        final int unitPrice = 56000;
        double area;
        long finalPrice;

        System.out.print("주택지 면적을 평(pyeong) 단위로 입력하세요: ");
        area = keyboard.nextDouble();

        double totalPrice = area * unitPrice;
        finalPrice = (long) (totalPrice / 1000) * 1000;

        System.out.println("계산된 주택지 가격: " + finalPrice + "원");

    }
}