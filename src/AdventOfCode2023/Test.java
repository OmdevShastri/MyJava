package AdventOfCode2023;

public class Test {
    public static void main(String[] args) {
        // Example document
        String[] document = {
                "1abc2",
                "pqr3stu8vwx",
                "a1b2c3d4e5f",
                "treb7uchet"
        };

        // Calculate the sum of calibration values
        int result = sumCalibrationValues(document);

        System.out.println("Sum of all calibration values: " + result);
    }

    public static int sumCalibrationValues(String[] document) {
        int totalSum = 0;

        for (String line : document) {
            int firstDigit = Character.getNumericValue(line.charAt(0));
            int lastDigit = Character.getNumericValue(line.charAt(line.length() - 1));
            int calibrationValue = Integer.parseInt(String.valueOf(firstDigit+lastDigit));
            totalSum += calibrationValue;
        }

        return totalSum;
    }
}
