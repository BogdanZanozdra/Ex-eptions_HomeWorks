package HomeWorks.DZ_1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task_3 {
//    3 Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращает
//    новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
//    Если длины массивов не равны, необходимо как-то оповестить пользователя.

    public static void main(String[] args) {
        int[] arr_1 = {1,3,5,6};
        int[] arr_2 = {2,3,1};
        int[] res = myltyplyArrays(arr_1, arr_2);
        System.out.println(Arrays.toString(res));
    }
    static int[] myltyplyArrays(int[] firstArray, int[]secondArray){
        if (firstArray.length != secondArray.length){
            throw new RuntimeException("Длинны массивов не одинаковы!");
        }

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = firstArray[i] * secondArray[i];
        }
        return firstArray;
    }

}
