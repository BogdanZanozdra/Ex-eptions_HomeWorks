package HomeWorks.DZ_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_1 {
//    Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает
//    введенное значение. Ввод текста вместо числа не должно приводить
//    к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

    private static void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter double number");
        try {
            double n = scanner.nextDouble();
            System.out.println(n);
        } catch (InputMismatchException e) {
            System.err.println("It is not a double number, try again");
            input();
        }
    }

    public static void main(String[] args) {
        input();
    }



}



