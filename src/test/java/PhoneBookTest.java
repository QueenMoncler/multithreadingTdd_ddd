import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class PhoneBookTest {
    public String name1 = "AAA";
    public String name2 = "BBB";
    public long number1 = 8_926_789_00_98L;
    public long number2 = 8_926_709_00_90L;
    @Test
    public void testAdd(){
        PhoneBook phoneBook = new PhoneBook();
        int answ = phoneBook.add(name1, number1);
        assertTrue("Error " + name1 + " и " + number1, phoneBook.add(name2, number2) != answ);
    }

    @Test
    public void testFindByNumber(){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(name1, number1);
        phoneBook.add(name2, number2);
        assertTrue("Error " + number1,  phoneBook.findByNumber(number1)!=null);
    }


    @Test
    public void testFindByName(){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(name1, number1);
        phoneBook.add(name2, number2);
        assertTrue("Error " + name1,  phoneBook.findByName(name1)!=0);
    }


}
