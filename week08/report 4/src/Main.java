//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                double purchase = 1015000;
                double margin = 0.30;
                double taxRate = 0.10;

                double sell;
                double sale;
                double Pay;
                double buy;

                System.out.printf("초기 매입 원가: %.0f 원\n", purchase);
                System.out.printf("적용 이익률: %.0f%%\n", margin * 100);

                sell = purchase * (1 + margin);
                System.out.printf("1) 정가 (판매가/매출액): %.0f 원\n", sell);

                sale = sell * taxRate;
                System.out.printf("2) 매출 세액 (정가 10%%): %.0f 원\n", sale);

                buy = purchase * taxRate;
                System.out.printf("3) 매입 세액 (원가 10%%): %.0f 원\n", buy);

                Pay = sale - buy;

                System.out.printf("최종 납부 세액: %.0f 원\n", Pay);
            }
        }