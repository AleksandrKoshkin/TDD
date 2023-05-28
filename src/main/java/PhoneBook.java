import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    public Map<String, String> book = new TreeMap<>();
    public int contact = 0;

    public Integer add(String name, String phone) {
        if (book.containsKey(name)) {
            return -1;
        } else {
            book.put(name, phone);
            contact++;
            return contact;
        }
    }

    public String findByNumber(String phone) {
        return book.entrySet().stream().filter((x) -> x.getValue().equals(phone)).map(Map.Entry::getKey).findFirst().get();
    }

    public String findByName(String name) {
        return book.get(name);
    }
    public List<String>  printAllNames(){
        return null;
    }
}
