package geekbrains.Lesson2_JavaCore_GB_Exception;

import java.util.Arrays;

public class Lesson2_Exception {

    static String[][] arrayDataException = {{"1", "2", "3", "4"}, {"7", "6", "7", "8"}, {"9", "ш", "7", "8"}, {"5", "6", "7", "8"}};
    static String[][] arraySizeException = {{"1", "2"}, {"1", "6",}, {"9", "6"}, {"5", "6"}};
    static String[][] arrayWithNoError = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "6", "7", "8"}, {"5", "6", "7", "8"}};

    static int sizeA = 4;
    static int sizeB = 4;

    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(arrayWithNoError));
        try {
            System.out.println("Сумма массива: " + getSumm(arrayWithNoError));
        } catch (MyArraySizeException | MyArrayDataException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println(Arrays.deepToString(arraySizeException));
        try {
            System.out.println("Сумма массива: " + getSumm(arraySizeException));
        } catch (MyArraySizeException | MyArrayDataException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println(Arrays.deepToString(arrayDataException));
        try {
            System.out.println("Сумма массива: " + getSumm(arrayDataException));
        } catch (MyArraySizeException | MyArrayDataException ex){
            System.out.println(ex.getMessage());
        }
    }

    static Integer getSumm(String[][] array) throws MyArrayDataException, MyArraySizeException {
        checkValue(array);
        Integer result = 0;
        int i = 0;
        int j = 0;
        try {
            for (; i < array.length; i++) {
                j =0;
                for (; j < array.length; j++) {
                    result = result + Integer.valueOf(array[i][j]);
                }
            }
        } catch (NumberFormatException ex){
            throw new  MyArrayDataException("Ошибка в позиции: " + i+","+j);
        }
        return result;
    }

    static void checkValue(String[][] array) throws MyArraySizeException{
        if(array.length!=sizeA || array[0].length!=sizeB) throw new MyArraySizeException("А размерчик то не тот)");
    }

}
