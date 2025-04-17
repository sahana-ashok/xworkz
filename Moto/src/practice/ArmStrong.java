package practice;

public class ArmStrong {
    public static void main(String[] args) {
        int number = 153;
        int originalNumber = number;
        int result = 0;


        int digits = String.valueOf(number).length();


        while (number != 0) {
            int digit = number % 10;
            result += digit* digit * digit;
            number /= 10;
        }

        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
    }

