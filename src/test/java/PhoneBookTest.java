import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PhoneBookTest {
    @Test
    public void testAdd(){
        PhoneBook phoneBook = new PhoneBook();
        String name = "test";
        long number = 8_926_789_00_98L;
        int answ = phoneBook.add(name, number);
        assertTrue("Не может быть пустым! " + name + " и " + number, answ != 0);
    }
}
