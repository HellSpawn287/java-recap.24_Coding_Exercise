public class LastDigitChecker {

    public static boolean hasSameLastDigit(int first, int second, int third) {
        boolean condition = false;
        if ((first < 10) || (first > 1000) ||
                (second < 10) || (second > 1000) ||
                (third < 10) || (third > 1000))
        {
            return false;
        }
        while ((first > 0) && (second > 0) && (third > 0)) {
            int digit1;
            int digit2;
            int digit3;
            digit1 = first % 10;
            digit2 = second % 10;
            digit3 = third % 10;


            first = first / 10;
            second = second / 10;
            third = third / 10;

           /* condition = (first == second) || (first == digit2) ||
                    (first == third) || (first == digit3) ||
                    (digit1 == second) || (digit1 == digit2) ||
                    (digit1 == third) || (digit1 == digit3) ||
                    (digit2 == digit3) || (digit2 == third) ||
                    (digit3 == second) || (third == second);*/

//          SPrawdzamy ostatnie cyfry! Nie wszystkie
           condition = (digit1 == digit2) ||
                    (digit1 == digit3) || (digit2 == digit3);

            return condition;
        }
        return condition;
    }

    public static void main(String[] args) {
        int first = 25;
        int second = 12;
        int third = 43;
        System.out.println("\n\nNumbers :" + first + " and " + second + " and " + third +
                "\nShared digit = " + hasSameLastDigit(first, second, third));

        first = 12;
        second = 23;
        third = 55;
        System.out.println("\n\nNumbers :" + first + " and " + second + " and " + third +
                "\nShared digit = " + hasSameLastDigit(first, second, third));


        first = 41;
        second = 22;
        third = 71;
        System.out.println("\n\nNumbers :" + first + " and " + second + " and " + third +
                "\nShared digit = " + hasSameLastDigit(first, second, third));


        first = 9;
        second = 99;
        third = 999;
        System.out.println("\n\nNumbers :" + first + " and " + second + " and " + third +
                "\nShared digit = " + hasSameLastDigit(first, second, third));


        first = -90;
        second = 99;
        third = 999;
        System.out.println("\n\nNumbers :" + first + " and " + second + " and " + third +
                "\nShared digit = " + hasSameLastDigit(first, second, third));


        first = 0;
        second = 1002;
        third = 999;
        System.out.println("\n\nNumbers :" + first + " and " + second + " and " + third +
                "\nShared digit = " + hasSameLastDigit(first, second, third));

        first = 22;
        second = 23;
        third = 34;
        System.out.println("\n\nNumbers :" + first + " and " + second + " and " + third +
                "\nShared digit = " + hasSameLastDigit(first, second, third));

    }

}

