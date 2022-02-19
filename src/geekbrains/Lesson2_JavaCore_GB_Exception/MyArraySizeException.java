package geekbrains.Lesson2_JavaCore_GB_Exception;

public class MyArraySizeException extends Exception {

    public MyArraySizeException(String error){ super(error); }

    @Override
    public String toString(){
        return "MyArraySizeException{}";
    }

}
