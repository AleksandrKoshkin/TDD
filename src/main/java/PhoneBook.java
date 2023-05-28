import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public  Map<String, String> book = new HashMap<>();
    public  int contact = 0;

    public  Integer add(String name, String phone) {
        if (book.containsKey(name)) {
            return -1;
        } else {
            book.put(name, phone);
            contact++;
            return contact;
        }
    }
    public  String findByNumber(String phone){
        return  null;
    }
}
