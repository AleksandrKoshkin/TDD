import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public static Map<String, String> book = new HashMap<>();
    public static int contact = 0;

    public static Integer add(String name, String phone) {
        if (book.containsKey(name)) {
            return -1;
        } else {
            book.put(name, phone);
            contact++;
            return contact;
        }
    }
}
