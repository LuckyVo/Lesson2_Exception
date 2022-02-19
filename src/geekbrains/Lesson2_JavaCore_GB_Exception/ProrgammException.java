package geekbrains.Lesson2_JavaCore_GB_Exception;


public class ProrgammException  {

    public void arraySizeException(String[][] arr) throws MyArraySizeException {
        if (arr.length > 4 || arr.length < 4) throw new MyArraySizeException("А размерчик то, не тот!");
    }

    public void arrayDataException (int arrs) throws MyArrayDataException {
        int arrsPosition;
        try {
            arrsPosition = Integer.parseInt(String.valueOf(arrs));
            arrsPosition = arrs;
        } finally {
            arrsPosition = 0;
        }
    }
}
