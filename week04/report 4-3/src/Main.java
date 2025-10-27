import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // 화폐 단위별 가치 상수 정의
        final int DOLLAR_VALUE = 100;
        final int HALF_VALUE = 50;
        final int QUARTER_VALUE = 25;
        final int DIME_VALUE = 10;
        final int NICKEL_VALUE = 5;
        final int PENNY_VALUE = 1;
        // 변수 선언
        int dollars, halves, quarters, dimes, nickels, pennies;
        int totalCents;
        int finalDollars, finalCents;
        // 각 화폐의 개수 입력
        System.out.print("달러(dollar) 개수를 입력하세요: ");
        dollars = keyboard.nextInt();
        System.out.print("하프(half) 개수를 입력하세요: ");
        halves = keyboard.nextInt();
        System.out.print("쿼터(quarter) 개수를 입력하세요: ");
        quarters = keyboard.nextInt();
        System.out.print("다임(dime) 개수를 입력하세요: ");
        dimes = keyboard.nextInt();
        System.out.print("니켈(nickel) 개수를 입력하세요: ");
        nickels = keyboard.nextInt();
        System.out.print("페니(penny) 개수를 입력하세요: ");
        pennies = keyboard.nextInt();
        // 총 센트 금액 계산
        totalCents = (dollars * DOLLAR_VALUE) +
                (halves * HALF_VALUE) +
                (quarters * QUARTER_VALUE) +
                (dimes * DIME_VALUE) +
                (nickels * NICKEL_VALUE) +
                (pennies * PENNY_VALUE);
           // 총 금액을 달러와 센트로 변환
        finalDollars = totalCents / 100;
        finalCents = totalCents % 100;
        // 결과 출력
        System.out.println("\n>>>>>> 총 금액 계산 결과 <<<<<<");
        System.out.printf("총 금액은 %d 달러 %d 센트 입니다.\n", finalDollars, finalCents);
        System.out.printf("총 금액은 %.2f 달러 입니다.\n", (double)totalCents / 100);
    }
}

