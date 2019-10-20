public class PerfectNumber {


    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sum = 0;
        while (true) {
            for (int i = 1; (i < (number)); i++) {
                if (((number % i) == 0)) {
                    sum += i;
                } else {
                    continue;
                }
            }
            return sum == number;
        }
    }

    public static void main(String[] args) {
        int number = 6;
        System.out.println("\n\nNumbers :" + number +
                "\n is a perfect number : " + isPerfectNumber(number));

        number = 28;
        System.out.println("\n\nNumbers :" + number +
                "\n is a perfect number : " + isPerfectNumber(number));

        number = 5;
        System.out.println("\n\nNumbers :" + number +
                "\n is a perfect number : " + isPerfectNumber(number));

        number = -1;
        System.out.println("\n\nNumbers :" + number +
                "\n is a perfect number : " + isPerfectNumber(number));

        number = 0;
        System.out.println("\n\nNumbers :" + number +
                "\n is a perfect number : " + isPerfectNumber(number));
    }
}
