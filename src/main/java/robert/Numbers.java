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

    public static void floydTriangle(int rows) {
        for (int i = 1, number = 0; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(++number + " ");
            }
            System.out.println();
        }
    }
}
