package HomeWorks.DZ_2;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        String str = scanner.nextLine();
        double d = 0;
        try {
            d = Double.parseDouble(str);
        } catch (NumberFormatException ex) {
            System.out.println("Не число или пустая строка!");
        }
        System.out.println(d);
    }

}
