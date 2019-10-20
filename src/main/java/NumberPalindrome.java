import static java.lang.Math.*;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        number = (int) sqrt(pow(number,2)); //wartość bezwzględna

/*        wartość bezwzględną również można uzyskać:
*         number = Math.abs(number);     */

        String reverse = "";
        String str = String.valueOf(number);
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        if (reverse.equals(str)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int number = -707;
        System.out.println("Number " + number + " is palindrome :" + isPalindrome(number));

        number = -1221;
        System.out.println("Number " + number + " is palindrome :" + isPalindrome(number));

        number = 11;
        System.out.println("Number " + number + " is palindrome :" + isPalindrome(number));

        number = 12621;
        System.out.println("Number " + number + " is palindrome :" + isPalindrome(number));

        number = -3367;
        System.out.println("Number " + number + " is palindrome :" + isPalindrome(number));
    }
}
