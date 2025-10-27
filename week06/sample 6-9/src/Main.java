
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int CIGA = 7; // 분
        int life;
        int ga;

        float minute;
        float year = 0;
        float day = 0;
        float hour = 0;
        float temp = 0;

        System.out.print("당신은 몇년동안 담배를 피웠나요 ? ");
        life = keyboard.nextInt();
        System.out.print("하루에 평균 몇개피를 피웠나요 ? ");
        ga = keyboard.nextInt();

        minute = life * 24.0f * 60 * CIGA;

        year = minute / 60 / 24 / 365;
        day =  minute / 60 / 24;
        hour = minute - (int) day * 24 * 60;

        System.out.printf("담배 1개피는 %d분의 생명을 단축 합니다.\n", CIGA);
        System.out.printf("%d년동안 %d 개피의 담배를 피우면 %,.1f분의 생명이 단축 됩니다.\n",
                life, ga, minute);
        System.out.printf("%,.1f분은 %.1f년 %.1f일 %.0f시간 %.0f분 입니다.\n",
                minute, year, day, hour, temp);
    }
}
