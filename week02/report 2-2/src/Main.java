import java.util.Scanner;

public class Main {
public static void main(String[] args) {

final double PI = 3.14;

Scanner keyboard = new Scanner(System.in);

int radius;
double boxarea;
double circlearea;
double area;
    System.out.print("원의 반지름 :");
radius = keyboard.nextInt();

boxarea = (2 * radius) * (2 * radius);

circlearea = radius * radius * PI;

area = boxarea - circlearea;


System.out.printf("정사각형 면적 : %.2f Cm2\n ", boxarea);
System.out.printf("원의 면적 : %.2f Cm2\n", circlearea);
System.out.printf("구하는 면적 : %.2f Cm2\n", area);
}
}
