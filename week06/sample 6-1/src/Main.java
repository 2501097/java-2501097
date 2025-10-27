
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final int KOREA = 99720;
        final int NORTHKOREA = 122762;
        final int USA = 9631418;
        final int JAPAN = 377873;
        float temp1, temp2, temp3;

        temp1 = (float) NORTHKOREA / KOREA;
        temp2 = (float) USA / KOREA;
        temp3 = (float) JAPAN / KOREA;

        System.out.printf("대한민국의 면적 : %,d ㎢\n", KOREA);
        System.out.printf("북한의 면적 : %,d ㎢\n", NORTHKOREA);
        System.out.printf("미국의 면적 : %,d ㎢\n", USA);
        System.out.printf("일본의 면적 : %,d ㎢\n", JAPAN);

        System.out.printf("북한은 대한민국에 %.1f 배 입니다\n", temp1);
        System.out.printf("미국은 대한민국에 %.1f 배 입니다.\n", temp2);
        System.out.printf("일본은 대한민국에 %.1f 배 입니다\n", temp3);
    }
}
