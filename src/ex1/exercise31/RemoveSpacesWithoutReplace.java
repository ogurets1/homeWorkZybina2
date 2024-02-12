package ex1.exercise31;

public class RemoveSpacesWithoutReplace {

    public static void main(String[] args) {

        String str = "Пример строки с пробелами"; // Пример строки с пробелами (можно изменить)
        String strWithoutSpaces = removeSpaces(str);

        System.out.println("Строка без пробелов: " + strWithoutSpaces);
    }

    public static String removeSpaces(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }
}
