package practice;

public class ExceptionHandlingExample{

    public static void main(String[] args) {

        // try-catch block to handle the exception.
        try {
            int[] num = {1, 2, 3, 4}; // Declare int Array.
            System.out.println(num[4]);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
