package warmup;

public class Main {

    public static void main(String[] args) {
        // My code
        int sum = 0;

        for (int i = 3; i < 1000; i = i+3) {
            sum = sum + i;
        }

        for (int i = 5; i < 1000, i = i + 5) {
            sum = sum + i;
        }

        for (int i = 15; i < 1000; i = i + 15) {
            sum = sum - i;
        }

        System.out.println("The sum of all multiples of 3 and 5 under 1000 is: " + sum)





    }
}
