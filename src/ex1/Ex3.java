package ex1;

public class Ex3 {
    public static int[] removeElements(int[] arr, int num) {
        int count = 0;

        // Определение количества элементов, которые нужно удалить
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }
        }

        // Создание нового массива с размером, учитывающим удаленные элементы
        int[] newArr = new int[arr.length - count];
        int index = 0;

        // Копирование элементов, исключая удаляемый элемент
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num) {
                newArr[index] = arr[i];
                index++;
            }
        }

        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 5, 2, 8, 5, 6, 1, 5};
        int num = 5;

        int[] newArr = removeElements(arr, num);

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }


}