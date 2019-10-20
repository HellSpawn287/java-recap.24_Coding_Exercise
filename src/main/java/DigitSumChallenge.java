public class DigitSumChallenge {
/*

//      >>>>>>>>> Tym sposobem metoda jest ograniczona
//      dla liczb większych niż 100_000 <<<<<<<<<<<<<<


    static int sumDigits(int number) {
        while (number >= 10) {
            int fifthSignificantDigit;
            int forthSignificantDigit;
            int thirdSignificantDigit;
            int secondSignificantDigit;
            int leastSignificantDigit;
            int sum;
            if (number >= 10_000) {
                fifthSignificantDigit = number / 10000;
                forthSignificantDigit = (number % 10000) / 1000;
                thirdSignificantDigit = ((number % 10000) % 1000) / 100;
                secondSignificantDigit = (((number % 10000) % 1000) % 100) / 10;
                leastSignificantDigit = (((number % 10000) % 1000) % 100) % 10;
                sum = fifthSignificantDigit + forthSignificantDigit + thirdSignificantDigit +secondSignificantDigit +leastSignificantDigit;
            } else if (number >= 1_000) {
                forthSignificantDigit = number / 1000;
                thirdSignificantDigit = (number % 1000) / 100;
                secondSignificantDigit = ((number % 1000) % 100) / 10;
                leastSignificantDigit = ((number % 1000) % 100) % 10;
                sum = forthSignificantDigit + thirdSignificantDigit +secondSignificantDigit +leastSignificantDigit;
            } else if (number >= 100) {
                thirdSignificantDigit = number / 100;
                secondSignificantDigit = (number % 100) / 10;
                leastSignificantDigit = number % 10;
                sum = thirdSignificantDigit +secondSignificantDigit +leastSignificantDigit;
            } else {
                leastSignificantDigit = number % 10;
                secondSignificantDigit = number / 10;
                sum = secondSignificantDigit +leastSignificantDigit;
            } return sum;
        }
        return -1;

    }

*/

    static int sumDigits(int number) {
        int sum = 0;
        if (number < 10) {
            return -1;
        }
        while (number > 0) {
            int digit;
            digit = number % 10;
            sum += digit;
            number = number / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(">>>>>>>>>>>>>>><<<<<<<<<<<<<<");
        System.out.println((((1256 % 1000) % 1000) % 100) % 10);

        System.out.println(">>>>>>>>>>>>>>><<<<<<<<<<<<<<");
        System.out.println(1256 / 10);
        System.out.println(125 % 10);
        System.out.println("\n>>>>>>>>>>>>>>>SUM of all DIGITS <<<<<<<<<<<<<<");
        int number = 12567;
        System.out.println("\nDigit sum of number" + number + " equals = " + sumDigits(number));
        number = 125;
        System.out.println("\nDigit sum of number" + number + " equals = " + sumDigits(number));
        number = 12;
        System.out.println("\nDigit sum of number" + number + " equals = " + sumDigits(number));
        number = 36570;
        System.out.println("\nDigit sum of number" + number + " equals = " + sumDigits(number));
        number = 5;
        System.out.println("\nDigit sum of number" + number + " equals = " + sumDigits(number));
    }

}
