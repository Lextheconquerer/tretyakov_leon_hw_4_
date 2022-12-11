import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        executeTaskOne();

    }
    public static void executeTaskOne() {
        double[] randomNumbers = {6, -15, 34, 67, 14.3, -65.7, 800, -6464, 15, 124.56, 34, -344, 23.5, 56, 355.6};
        double sum = 0;
        int counter = 0;
        boolean isFirstNegativeNumber = false;
        for (double average : randomNumbers) {
            if (isFirstNegativeNumber && average < 0) {
                continue;
            }
            if (average > 0) {
                sum += average;
                counter++;
            } else {
                isFirstNegativeNumber = true;
                sum = 0;
                counter = 0;
            }
            double result = sum / counter;
            System.out.println("\tСреднее арифметическое = " + result + "\n");
        }


    }
}

