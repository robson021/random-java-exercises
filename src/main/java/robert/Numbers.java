package robert;

public class Numbers {

    public static boolean isNumberPalindrome(int number) {

        System.out.println("input: " + number);

        int copyOfNumber = number;

        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        System.out.println("reversed input: " + reversed);

        return reversed == copyOfNumber;

    }
}
