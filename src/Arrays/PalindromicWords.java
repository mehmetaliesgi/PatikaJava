package Arrays;

public class PalindromicWords {
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindromee(String str) {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        if (str.equals(reverse)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        String palindrome = "kavak";
        String notPalindrome = "string";

        if (isPalindrome(palindrome)) {
            System.out.println("Girdiğiniz değer palindrome bir değerdir: " + palindrome);
        }
        else {
            System.out.println("Girdiğiniz değer palindrome bir değer değildir: " + palindrome);
        }

        if (isPalindromee(palindrome)) {
            System.out.println("Girdiğiniz değer palindrome bir değerdir: " + palindrome);
        }
        else {
            System.out.println("Girdiğiniz değer palindrome bir değer değildir: " + palindrome);
        }

        if (isPalindrome(notPalindrome)) {
            System.out.println("Girdiğiniz değer palindrome bir değerdir: " + notPalindrome);
        }
        else {
            System.out.println("Girdiğiniz değer palindrome bir değer değildir: " + notPalindrome);
        }

        if (isPalindromee(notPalindrome)) {
            System.out.println("Girdiğiniz değer palindrome bir değerdir: " + notPalindrome);
        }
        else {
            System.out.println("Girdiğiniz değer palindrome bir değer değildir: " + notPalindrome);
        }

    }
}
