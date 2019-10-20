public class NumberToWords {

    public static void numberToWords(int number) {

        int lastdigit = 0;
        int count = getDigitCount(number);
        //System.out.println("Count is "+count);
        number = reverse(number);
        int reversedCount = getDigitCount(number);

        if (number < 0) {
            System.out.println("Invalid Value");
        }
        while (number > 0) {
            switch (number % 10) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Other");
                    break;
            }
            number /= 10;
        }
        if (reversedCount < count) {
            for (int i = reversedCount; i < count; i++) {
                System.out.println("Zero");
            }
        }
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        } else if (number > 0) {
            int lastdigit = 0;
            int count = 0;
            while (number > 0) {
                lastdigit = number % 10;
                count++;
                number = number / 10;
            }
            return count;
        } else {
            return 1;
        }
    }

    public static int reverse(int number) {
        int reversednumber = 0;
        int lastdigit = 0;

        if (number < 0) {
            number = number * -1;


            while (number > 0) {
                lastdigit = number % 10;
                reversednumber = reversednumber * 10;
                reversednumber = reversednumber + lastdigit;
                number = number / 10;
            }
            return -reversednumber;
        } else {
            while (number > 0) {
                lastdigit = number % 10;
                reversednumber = reversednumber * 10;
                reversednumber = reversednumber + lastdigit;
                number = number / 10;
            }
            return reversednumber;
        }
    }


    public static void main(String[] args) {
//        numberToWords(123);
        numberToWords(1010);

    }
}
