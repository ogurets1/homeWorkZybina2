package ex1.exercise31;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "madam";
        StringBuilder reversedStr = new StringBuilder(str).reverse();

        if (str.equals(reversedStr.toString())) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }

        int num = 12321;
        int originalNum = num;
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
    }
}
