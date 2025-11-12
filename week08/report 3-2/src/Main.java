import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String socialClass;
        double totaluse, totalSave;
        double food;
        double engel = 0.0;

        System.out.print("총 지출액을 입력하세요 (원): ");
        totaluse = keyboard.nextDouble(); //
        System.out.print("총 저축액을 입력하세요 (원): ");
        totalSave = keyboard.nextDouble();


        food = totaluse - totalSave;

        if (totaluse > 0) {
            engel = (food / totaluse) * 100;
        } else {
            System.out.println("\n[오류] 총 지출액이 0이므로 앵겔 지수를 계산할 수 없습니다.");
        }

        if (engel >= 0 && engel <= 30) {
            socialClass = "상류층";
        } else if (engel >= 31 && engel <= 50) {
            socialClass = "중산층";
        } else {
            socialClass = "하류층";
        }

        System.out.printf("  총 지출액: %.0f원\n", totaluse);
        System.out.printf("  총 저축액: %.0f원\n", totalSave);
        System.out.printf("  식생활비: %.0f원\n", food);
        System.out.printf("  앵겔 지수: %.2f\n", engel);
        System.out.printf("  판정 계층: %s\n", socialClass);
    }
}