
public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int i = 0;

        while (n > 0) {
            boolean isEven = n % 2 == 0; // Move this inside the loop

            if (isEven) {
                n = n / 2;
            } else {
                n--;
            }
            i++;
        }
        // Print the number of iterations
        System.out.println("Total iterations: " + i);
    }
}

