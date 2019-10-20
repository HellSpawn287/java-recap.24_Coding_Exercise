public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if ((first < 10) || (second < 10)) {
            return -1;
        }
        int gcDiv =0;

        while(true){
            for (int i = 1; (i <= (second)) ; i++) {
                if (((first%i)==0) && ((second%i)==0)){
                    gcDiv=i;

                } else {
                    continue;
                }
            }
            return gcDiv;
        }
    }

    public static void main(String[] args) {
       int first = 12;
        int second = 30;
        System.out.println("\n\nNumbers :" + first + " and " + second +
                "\nShared greatest common Divisor = " + getGreatestCommonDivisor(first, second));
    }
}
