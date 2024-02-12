package ex1.exercise31;

public class RemoveSpacesFromString {

    public static void main(String[] args) {

        String str = "Пример строки с пробелами"; // Пример строки с пробелами (можно изменить)
        String strWithoutSpaces = removeSpaces(str);

        System.out.println("Строка без пробелов: " + strWithoutSpaces);
    }

    public static String removeSpaces(String str) {
        return str.replace(" ", "");
    }
}