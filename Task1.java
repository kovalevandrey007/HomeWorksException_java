import java.util.Scanner;

public class Task1 {
    public static Object isNumeric(String num) {

        try {
            Float.parseFloat(num);
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели не тот формат числа!");
            return e;
        }
        return num;
    }

    public static void main(String[] args) {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите дробное число в формате '0.00'");
            String num = sc.nextLine();
            Object res = isNumeric(num);
            System.out.println(res);
        } while (true);
    }
}





            //        Реализуйте метод, который запрашивает у пользователя ввод
//        дробного числа (типа float), и возвращает введенное значение. Ввод
//        текста вместо числа не должно приводить к падению приложения, вместо этого,
//        необходимо повторно запросить у пользователя ввод данных.
 //           result = num;
//        } else {
//            result = sc.next();
//        }
//
//
//        return result;
//    }
//    }


