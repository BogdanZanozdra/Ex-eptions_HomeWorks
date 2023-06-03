package HomeWorks.DZ_1;

import java.util.Scanner;
//    1 Реализуйте 3 метода, чтобы в каждом из них получить разные стандартные для Java исключения;
public class Task_1 {
    public static void main(String[] args) {
//        divide(5, 0);
//        getValue(new int [] {1, 3, 4, 6}, 7);
//       input(); //если ввести не интовое значение, получим InputMismatchException
    }

    static void divide(int a, int b){
        System.out.println(a / b);
    }

    static void getValue(int [] array, int index){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[index]);
        }
    }

    static void input(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
    }

}


