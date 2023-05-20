import java.util.zip.DataFormatException;

public class MyDataException extends DataFormatException {
    public MyDataException() {
        super("Не верный формат даты!");
    }
}
