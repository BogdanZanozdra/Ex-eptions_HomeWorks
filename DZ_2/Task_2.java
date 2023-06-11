package HomeWorks.DZ_2;

public class Task_2 {
    public static void main(String[] args) {
        try {
            int[] array = {1, 3, 1, 6, 4};
            int d = 0;
            double caughtRes1 = array[4] / d;
            System.out.println("caughtRes1 = " + caughtRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
