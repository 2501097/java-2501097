import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int base;
        int height;
        float area;   //정보

        System.out.print("삼각형의 밑변 입력(Cm) ");
        base = keyboard.nextInt();
        System.out.print("삼각형의 높이 입력(Cm) ");
        height = keyboard.nextInt();

        area = (base * height) / 2.0f;


        System.out.println(">>>>>>삼각형의 면적 <<<<<<");
        System.out.printf("\t밑변 : %,d Cm\n", base);
        System.out.printf("\t높이 : %,d Cm\n", height);
        System.out.printf("\t면적 : %,.2f \u33a0\n", area);
    }
}