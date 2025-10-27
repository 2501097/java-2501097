import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("총 구매 금액을 입력하세요: ");
        int price = keyboard.nextInt();

        System.out.print("멤버십 회원입니까? (true/false): ");
        boolean isMember = keyboard.nextBoolean();

        boolean isFreeShipping = false;

        // 무료 배송 조건 판별
        if (price >= 50000 || (isMember && price >= 30000)) {
            isFreeShipping = true;
        }
        if (isFreeShipping) {
            System.out.println("무료 배송이 적용됩니다.");
        } else {
            System.out.println("무료 배송 대상이 아닙니다.");
        }
        keyboard.close();
    }
}
