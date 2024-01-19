import java.util.Arrays;

public class ArraysTasks {
    public static void replacingArrayElements() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void fillEmptyArray(){
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void multiplyingArrayNumbers(){
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void diagonalTwoDimensionalArray(){
        int[][] array = new int[5][5];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        /*
        Я понял как работает итерация в двухмерном массиве, но как правильно сравнить менжду собой i == j понять не могу,
        смотрел решение в интернете но там в корне другая реализация до которой я сам никогда бы не додумался.
         */

    }
    public static int[] NumberscomeinArrayscomeout(int len, int initialValue ) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
    /*
    Знаю что назвал метод не в соответствии с code convention но название именно в таком формате лично я считаю
    более понятным.
     */


    public static void main(String[] args) {
        replacingArrayElements();
        fillEmptyArray();
        multiplyingArrayNumbers();
        diagonalTwoDimensionalArray();
        NumberscomeinArrayscomeout(5,1);

    }
}
