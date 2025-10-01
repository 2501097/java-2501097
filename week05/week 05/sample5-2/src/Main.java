//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        boolean test = 5 > 3 && 6 < 4; // true &&(*) false -> false
        boolean test1 = 5 < 3 && 6 < 4; // false &&(*) ? -> false short-circuit - evaluation(단축연산)
        boolean test2 = 5 > 3 || 6 < 4; // true ||(+) ? -> true
        boolean test3 = 5 < 3 || 6 < 4; // false ||(+) false -> false

        boolean test4 = 5 > 3 & 6 < 4; // true &(*) false -> false
        boolean test5 = 5 < 3 & 6 < 4; // false &(*) ? -> false short-circuit - evaluation(단축연산)
        boolean test6 = 5 > 3 | 6 < 4; // true |(+) false -> true
        boolean test7 = 5 < 3 | 6 < 4; // false |(+) false -> false

        boolean test8 = ((('A' + 1) > 'c') && (('b' - 1) != 'a'));

        System.out.println(test);
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);
        System.out.println(test5);
        System.out.println(test6);
        System.out.println(test7);
        System.out.println(test8);
    }
}