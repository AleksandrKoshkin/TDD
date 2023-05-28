import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {

    @Test
    public void testAddPhoneBook() {
        PhoneBook phoneBook = new PhoneBook();
        final int expected = 1;
        final int result = phoneBook.add("Павел", "954605533");
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void testAddReplayPhoneBook() {
        PhoneBook phoneBook = new PhoneBook();
        final int expected = -1;
        phoneBook.add("Павел", "555105533");
        final int result = phoneBook.add("Павел", "954605533");
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        String expected="Павел";
        phoneBook.add("Павел", "555105533");
        String result=phoneBook.findByNumber("555105533");
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void testFindByName(){
        PhoneBook phoneBook = new PhoneBook();
        String expected="555105533";
        phoneBook.add("Павел", "555105533");
        String result=phoneBook.findByName("Павел");
        Assertions.assertEquals(expected, result);
    }

}
