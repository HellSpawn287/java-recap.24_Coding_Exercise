public class FactorPrinter {

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            System.out.println("Factors of " + number + " are :");
        }

        while (true) {
            for (int i = 1; (i <= (number)); i++) {
                if (((number % i) == 0)) {
                    System.out.println(i);
                } else {
                    continue;
                }
            } break;
        }
    }

    public static void main(String[] args) {
        printFactors(10);
        printFactors(32);
        printFactors(6);
        printFactors(-1);
    }
}
