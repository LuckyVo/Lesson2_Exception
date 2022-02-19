package geekbrains.Lesson2_JavaCore_GB_Exception;

public class MyArrayDataException extends Exception{

    public MyArrayDataException(String error){
        super(error);
    }

    @Override
    public String toString(){
        return "MyArrayDataException{}";
    }
}
