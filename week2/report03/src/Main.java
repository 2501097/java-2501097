import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {

            Scanner keyboard = new Scanner(System.in);
            String name="";
            int family = 0;
            String address= "";


            System.out.print("당신의 이름은?");
            name = keyboard.nextLine();
            System.out.printf("%s님의 가족은 몇 명입니까?",name);
            family = keyboard.nextInt();
            keyboard.nextLine();
            System.out.printf("%s님의 가족은 어디에 살지요?", name);
            address = keyboard.nextLine();
            keyboard.nextLine();


            System.out.printf("\n%s님의 가족은 %d명 입니다.\n", name, family);
            System.out.printf("%s님의 가족은 %s에서 살고 있습니다.\n", name,address );
        }
}