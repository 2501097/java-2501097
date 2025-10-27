import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int totalSeconds;

        System.out.print("초를 입력하세요: ");
        totalSeconds = keyboard.nextInt();

        int hours = totalSeconds / 3600; // 1. 전체 초를 3600으로 나누어 시간 계산
        int remainingSeconds = totalSeconds % 3600; // 2. 시간으로 나누고 남은 초 계산

        int minutes = remainingSeconds / 60; // 3. 남은 초를 60으로 나누어 분 계산
        int seconds = remainingSeconds % 60; // 4. 분으로 나누고 최종 남은 초 계산
        System.out.printf("%d초는 %d시간 %d분 %d초입니다.\n", totalSeconds, hours, minutes, seconds);
        keyboard.close();
    }
}
