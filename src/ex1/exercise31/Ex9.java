package ex1.exercise31;

public class Ex9 {
    public static void printOddNumbers(int[] arr) {
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.print(num+" ");
            }
        }
    }
    public static void printNumbersDivisibleByFive(int[] arr) {
        for (int num : arr) {
            if (num % 5 == 0) {
                System.out.print(num+" ");
            }
        }
    }
    public static void printNegativeNumbers(int[] arr) {
        for (int num : arr) {
            if (num < 0) {
                System.out.print(num+" ");
            }
        }
    }
    public static void printReverseArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void printCharactersInString(String str) {
        for (char c : str.toCharArray()) {
            System.out.print(c + " ");
        }
    }
    public static void addHelloAfterEachCharacter(String str) {
        for (char c : str.toCharArray()) {
            System.out.print(c + "Hello" + " ");
        }
    }
    public static void replaceLetters(String str) {
        String newStr = str.replaceAll("a", "d");
        System.out.print(newStr+" ");
    }
    public static void printStringsContainingZ(String[] arr) {
        for (String str : arr) {
            if (str.contains("z")) {
                System.out.print(str + " ");
            }
        }
    }
    public static int multiplyArrayElements(int[] arr) {
        int result = 1;
        for (int num : arr) {
            result *= num;
        }
        return result;
    }
    public static int sumArrayElements(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    public static String concatenateStrings(String[] arr) {
        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
        int[] arr_ = {-1,-2,-3,-4,-5};
        String msg = "Hello World";
        String msg_ = "Hello";
        String java = "JAVA";
        String[] arrmsg = {"Java", "Python", "JavaScript", "Ruby", "C++"};
        String[] arrmsg1 = {"zava","loz","zzzz"};

        printOddNumbers(arr);//1
        System.out.println();
        printNumbersDivisibleByFive(arr);//2
        System.out.println();
        printNegativeNumbers(arr_);//3/
        System.out.println();
        printReverseArray(arr);//4
        System.out.println();
        printCharactersInString(msg);//5
        System.out.println();
        addHelloAfterEachCharacter(msg_);//6
        System.out.println();
        replaceLetters(java);//7
        System.out.println();
        printStringsContainingZ(arrmsg1);//8
        System.out.println();
        int a = multiplyArrayElements(arr);//9
        System.out.println(a);
        int b = sumArrayElements(arr);//10
        System.out.println(b);
        String c = concatenateStrings(arrmsg);//11
        System.out.println(c);

    }
}


