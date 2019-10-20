public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int[] table = new int[10];
        int sum;
        while (number > 0) {
            int digit;
            for (int i = 0; i <= (table.length - 1); i++) {
                digit = number % 10;
                table[i] = digit;
            }
            number = number / 10;
        }
        System.out.println(table[0]);
        System.out.println(table[table.length - 1]);

        sum = table[0] + table[table.length - 1];
        return sum;
    }

    public static int sumFirstAndLastDigit_v2(int number) {
        if (number < 0) {
            return -1;
        }
        int sum;
        sum = number % 10;
        while (number / 10 >= 0) {
            if (number / 10 == 0) {
                sum += number % 10;
                break;
            }
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 212;
        System.out.println("\nSum of first&last digit " + number + " equals = " + sumFirstAndLastDigit(number));

        number = 257;
        System.out.println("\nSum of first&last digit " + number + " equals = " + sumFirstAndLastDigit(number));

        number = 0;
        System.out.println("\nSum of first&last digit " + number + " equals = " + sumFirstAndLastDigit(number));

        number = 5;
        System.out.println("\nSum of first&last digit " + number + " equals = " + sumFirstAndLastDigit(number));

        number = -10;
        System.out.println("\nSum of first&last digit " + number + " equals = " + sumFirstAndLastDigit(number));

        number = 10;
        System.out.println("\n>>>>> tu jest błąd. Wynik powinien wynosić 1 +0 = 1" +
                "\nSum of first&last digit " + number + " equals = " + sumFirstAndLastDigit(number));

        number = 2212;
        System.out.println("\nSum of first&last digit " + number + " equals = " + sumFirstAndLastDigit(number));


        System.out.println("\n\nWersja druga\n");

        number = 212;
        System.out.println("\nSum of first&last digit " + number + " equals = " + sumFirstAndLastDigit_v2(number));

        number = 257;
        System.out.println("\nSum of first&last digit " + number + " equals = " + sumFirstAndLastDigit_v2(number));

        number = 0;
        System.out.println("\nSum of first&last digit " + number + " equals = " + sumFirstAndLastDigit_v2(number));

        number = 5;
        System.out.println("\nSum of first&last digit " + number + " equals = " + sumFirstAndLastDigit_v2(number));

        number = -10;
        System.out.println("\nSum of first&last digit " + number + " equals = " + sumFirstAndLastDigit_v2(number));

        number = 10;
        System.out.println("\n>>>>>Sum of first&last digit " + number + " equals = " + sumFirstAndLastDigit_v2(number));

        number = 2212;
        System.out.println("\nSum of first&last digit " + number + " equals = " + sumFirstAndLastDigit_v2(number));
    }
}

