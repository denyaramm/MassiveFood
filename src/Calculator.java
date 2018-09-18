import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner Den = new Scanner(System.in);
        double fn, sn, result;
        System.out.println("Введите первое число:");
        fn = Den.nextDouble();
        System.out.println("Введите второе число:");

        result = fn + sn;

        System.out.println("Сумма равна: " + result);
    }
}
