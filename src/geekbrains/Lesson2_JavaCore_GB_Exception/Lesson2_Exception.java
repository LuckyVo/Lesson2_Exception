package geekbrains.Lesson2_JavaCore_GB_Exception;

import java.util.Arrays;

public class Lesson2_Exception {

    static ProrgammException prorgammException = new ProrgammException();
    static LessonArray lessonArray = new LessonArray();
    static String [][] arr = lessonArray.getLessonArray();

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        printArrays(arr);
        prorgammException.arraySizeException(arr);
        System.out.println("Сумма чисел массива: " + sumNumbersArrays(arr));

    }

    public static void printArrays(String[][] arr){
        System.out.println(Arrays.deepToString(arr));
    }

    public static int sumNumbersArrays(String[][] arr) throws MyArrayDataException{
        int[][] arrs = new int[arr.length][arr.length];
        int sumNumberArray = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arrs[i][j] = Integer.parseInt(arr[i][j]);
                sumNumberArray += arrs[i][j];
                prorgammException.arrayDataException(arrs[i][j]);
            }
        }
        return sumNumberArray;
    }

}
