package Java8;
import java.util.Optional;
public class Optional_Class {
    public static void main(String[] args) {
        String[] str = new String[10];
        str[4] = "JAVA OPTIONAL CLASS EXAMPLE";
        Optional<String> checkNull = Optional.of(str[5]);
        if (checkNull.isPresent()) {
            String lowercaseString = str[5].toLowerCase();
            System.out.print(lowercaseString);
        } else {
            System.out.println("string value is not present");
        }

    }
}