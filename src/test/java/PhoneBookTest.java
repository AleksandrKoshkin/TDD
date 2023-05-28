import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook();

    @Test
    public void testAddPhoneBook() {
        final int expected = 1;
        final int result = phoneBook.add("Павел", "954605533");
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void testAddReplayPhoneBook() {
        final int expected = -1;
        phoneBook.add("Павел", "555105533");
        final int result = phoneBook.add("Павел", "954605533");
        Assertions.assertEquals(expected, result);
    }
}
