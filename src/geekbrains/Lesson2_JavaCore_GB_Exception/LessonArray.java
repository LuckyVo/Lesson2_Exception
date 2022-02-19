package geekbrains.Lesson2_JavaCore_GB_Exception;

import java.util.Arrays;

public class LessonArray {
    private final String[][] arr = new String[4][4];

    public void myLessonArray() {
         for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = "777";
            }
        }
    }

    public String[][] getLessonArray(){
        myLessonArray();
        return arr;
    }


    public void getLessonArrayToInt(String[][] arr){
        int[][] intArr = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                intArr[i][j] = Integer.parseInt(arr[i][j]);
            }
        }
    }
}
