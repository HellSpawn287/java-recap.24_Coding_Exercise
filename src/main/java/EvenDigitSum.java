public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {

        int sumOfTheEvenDigits = 0;
        if (number < 0) {
            return -1;
        }
        while (number > 0) {
            if (number % 2 == 0) {
                int digit;
                digit = number % 10;
                sumOfTheEvenDigits += digit;
            }
            number = number / 10;
        }
        return sumOfTheEvenDigits;
    }


    public static void main(String[] args) {

        int number = 123456789;
        System.out.println("Number :" + number + "\nEven digit sum = " + getEvenDigitSum(number));

        number = 252;
        System.out.println("Number :" + number + "\nEven digit sum = " + getEvenDigitSum(number));

        number = -22;
        System.out.println("Number :" + number + "\nEven digit sum = " + getEvenDigitSum(number));

        number = 10;
        System.out.println("Number :" + number + "\nEven digit sum = " + getEvenDigitSum(number));

        number = 0;
        System.out.println("Number :" + number + "\nEven digit sum = " + getEvenDigitSum(number));

    }
}
