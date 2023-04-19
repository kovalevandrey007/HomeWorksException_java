import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое значение: ");
        String s = sc.nextLine();
        if (s == "") {
            throw new Exception("Пустые строки вводить нельзя.");
        } else System.out.println("Вы ввели: \n" + s);
    }
}


