package HomeWorks.DZ_1;

import java.util.Arrays;

public class Task_2 {
//    2 Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
//     -1 может быть NumberFormatException если в строке будут символы отличные от цифр,
//     -2 может быть ArrayIndexOutOfBoundsException так как в цикле j < 5.

    public static void main(String[] args) {
        String s[][] = {
            { "a1", "12", "13" },
            { "21", "22", "23" },
            { "31", "32", "31" }
        };
        sum2d(s);
    }
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }

}
