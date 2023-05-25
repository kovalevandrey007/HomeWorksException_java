import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Main {
    public static String LastName() throws MyStringFormatException, MyNullException{
        String Lastname = "Jonson";
        try {
            if (Lastname.isEmpty()) throw new MyNullException();
            else if (!(Lastname.matches("[A-Za-zА-яЁё]+"))) {
                throw new MyStringFormatException();
            } else return Lastname;
        } catch (NullPointerException e) {
            throw new MyNullException();
        } catch (IllegalAccessException e) {
            throw new MyStringFormatException();
        }
    }

    public static String Name() throws MyStringFormatException, MyNullException {
        String name = "Tom";
        try {
            if (name.isEmpty()) throw new MyNullException();
            else if (!(name.matches("[A-Za-zА-яЁё]+"))) {
                throw new MyStringFormatException();
            } else return name;
        } catch (NullPointerException e) {
            throw new MyNullException();
        } catch (IllegalAccessException e) {
            throw new MyStringFormatException();
        }
    }

    public static String SuriName() throws MyStringFormatException, MyNullException {
        String Suriname = "Volkovich";
        try {
            if (Suriname.isEmpty()) throw new MyNullException();
            else if (!(Suriname.matches("[A-Za-zА-яЁё]+"))) {
                throw new MyStringFormatException();
            } else return Suriname;
        } catch (NullPointerException e) {
            throw new MyNullException();
        } catch (IllegalAccessException e) {
            throw new MyStringFormatException();
        }
    }

    public static String DateBird() {
        String dateBird = "12.07.2022";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        try {
            simpleDateFormat.parse(dateBird);
            return dateBird;
        } catch (ParseException e) {
            throw new RuntimeException("Неверный формат даты!");
        }
    }


    public static Object NumPhone() {
        Object numPhone = "89001234";
        try {
            Integer.parseInt((String) numPhone);
            return numPhone;
        } catch (NumberFormatException e) {
            throw new MyNumberFormatException();
        }
    }

    public static String Male() {
        String male = "f";
        try {
            if (male.equals("m") || male.equals("f")) {
                return male;
            } else throw new RuntimeException("Формат введенных данных должен быть (f) или (m)!");
        } catch (IllegalArgumentException e) {
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) throws MyStringFormatException {
        ArrayList<String> names = new ArrayList<>();
        names.add(LastName());
        names.add(Name());
        names.add(SuriName());
        names.add(DateBird());
        names.add((String) NumPhone());
        names.add(Male());
        System.out.println(names);


        File OutFile = new File(LastName() + ".txt");

            try   (OutputStream next = new FileOutputStream(OutFile, true)) {
                if (!OutFile.exists()) {
                    next.write((names.toString().getBytes()));
                } else {
                    next.write((names.toString().getBytes()));
                    next.write("\n".getBytes());
                    System.out.println("Файл успешно записан/дозаписан!");
                }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Файл не найден!");
        } catch (IOException e) {
            throw new RuntimeException("Ошибка записи!");
        }
    }
}

