import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        final int COUNT = 5;
        int grade;
        int total = 0;
        float avg;

        int i = 1;
        while (i <= COUNT) {
            System.out.printf("%d번 학생 성적 입력 : ", i);
            grade = keyboard.nextInt();
            if (grade >= 0 && grade <= 100) {
                total += grade;
                i++;
            } else {
                System.err.println("ERROR : 0 ~ 100");
                System.in.read();
            }
        }

        avg = total / (float) COUNT;

        System.out.printf("총점 : %,d 점\n", total);
        System.out.printf("평균 : %.2f 점\n", avg);
    }
}