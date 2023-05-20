import java.io.*;
import java.util.Scanner;

public class WriteFile {
    private static Reader String;

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Введите Фамилия Имя Отчество: ");
            String FIO = sc.nextLine();

            BufferedReader br = new BufferedReader(String);
            try {

                File file = new File("NewFile.txt");

                if (!file.exists()) // файл не существует
                    file.createNewFile();
                PrintWriter pw = new PrintWriter(file);
                pw.println(FIO);
                // pw.println("Hello, my darling! 2");
                pw.close();

                br = new BufferedReader(new FileReader("NewFile.txt"));
                String line = br.readLine();
                while ((line = br.readLine()) != null) ;
                System.out.println(line);
            } catch (IOException e) {
                System.out.println("Error" + e);
            } finally {
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
