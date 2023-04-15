import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 5, 7, 1};
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int userValue = sc.nextInt();
        int result = negativeNum(arr, userValue);


        if (result == -1) System.out.println("Длина массива не может быть равной нулю.");
        else if (result == -2) System.out.println("Заданное число превышает длину массива.");
        else if (result == -3) System.out.println("Число не может быть отрицательным.");
        else System.out.println("Искомый элемент найден на позиции = " + result);
        sc.close();
    }

    public static int negativeNum(int[] arr, int userValue) {
        if (arr.length < userValue) {
            return -2;
        } else if (userValue == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (userValue < 0) {
                return -3;
                } else if (arr[i] == userValue) {
                return i;

            }
        }
        return -3;
    }
}










