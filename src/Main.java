import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) {

        var value = new Generic<>().getNome(new TableUse());

        System.out.println(value);
    }
}
