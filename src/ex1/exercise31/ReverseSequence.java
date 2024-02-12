package ex1.exercise31;

public class ReverseSequence {

    public static void main(String[] args) {
        String str = "Hello World";
        String reversed = reverseSequence(str);
        System.out.println("Reversed sequence: " + reversed);
    }

    public static String reverseSequence(String str) {
        char[] charArray = str.toCharArray();
        String reversed = "";

        for (int i = charArray.length - 1; i >= 0; i--) {
            reversed += charArray[i];
        }

        return reversed;
    }
}
