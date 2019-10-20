public class SharedDigit {
    public static boolean hasSharedDigit(int first, int second) {
        boolean condition = false;
        if ((first < 10) || (first > 99) ||
                (second < 10) || (second > 99)) {
            return false;
        }
        while (first > 0 && second > 0) {
            int digit1;
            int digit2;
            digit1 = first % 10;
            digit2 = second % 10;

            first = first / 10;
            second = second / 10;
            condition = (first == second) || (first == digit2) || (digit1 == second) || (digit1 == digit2);

            return condition;
        }
        return condition;
    }

    public static void main(String[] args) {
        int firt = 25;
        int second = 12;
        System.out.println("\n\nNumbers :" + firt +" and "+ second+ "\nShared digit = " + hasSharedDigit(firt,second));

        firt = 12;
        second = 23;
        System.out.println("\n\nNumbers :" + firt +" and "+ second+ "\nShared digit = " + hasSharedDigit(firt,second));

        firt = 9;
        second = 99;
        System.out.println("\n\nNumbers :" + firt +" and "+ second+ "\nShared digit = " + hasSharedDigit(firt,second));

        firt = 15;
        second = 25;
        System.out.println("\n\nNumbers :" + firt +" and "+ second+ "\nShared digit = " + hasSharedDigit(firt,second));

        firt = 15;
        second = 55;
        System.out.println("\n\nNumbers :" + firt +" and "+ second+ "\nShared digit = " + hasSharedDigit(firt,second));

        firt = 15;
        second = -55;
        System.out.println("\n\nNumbers :" + firt +" and "+ second+ "\nShared digit = " + hasSharedDigit(firt,second));

        firt = 0;
        second = 55;
        System.out.println("\n\nNumbers :" + firt +" and "+ second+ "\nShared digit = " + hasSharedDigit(firt,second));

        firt = 10;
        second = 100;
        System.out.println("\n\nNumbers :" + firt +" and "+ second+ "\nShared digit = " + hasSharedDigit(firt,second));


        firt = 100;
        second = 10;
        System.out.println("\n\nNumbers :" + firt +" and "+ second+ "\nShared digit = " + hasSharedDigit(firt,second));
    }
}
