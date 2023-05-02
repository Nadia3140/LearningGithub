package practice;

public class LearnException {

    public void Summation() {
        try {
            int[] num = {1, 2};
            int result = num[0] + num[1];
            System.out.println("Summation: " + result);
        } catch (Exception e) {
            System.out.println("Encounter Exception: " + e.getMessage());
        }
    }
    public void Subtraction() {
            try {
                int[] num = {1, 2};
                int result = num[2] - num[1];
                System.out.println("Subtraction: " + result);

            } catch (Exception e) {
                System.out.println("Encounter Exception: " + e.getMessage());

            }
        }
    public void Multiplication() {
        try {
            int[] num = {1, 2};
            int result = num[0] * num[1];
            System.out.println("Multiplication: " + result);
        } catch (Exception e) {
            System.out.println("Encounter Exception: " + e.getMessage());

        }
    }
}
