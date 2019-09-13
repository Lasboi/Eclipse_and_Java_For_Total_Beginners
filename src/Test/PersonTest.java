package Test;
import Classes.*;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

    /*
    Vi opretter en ny Classes.Person som vi kan teste dataen på.
    assertEquals betyder at vi tjekker på hvad vi expecter og at den værdi vi får ind er den samme som expected
     */
    public void testPerson() {
        Person p1 = new Person();
        assertEquals("unknown name", p1.getName());
        assertEquals(3, p1.getMaximumBooks());
    }

    public void testTestSetName() {
        Person p2 = new Person();
        p2.setName("Fred");
        assertEquals("Fred", p2.getName());
    }

    public void testSetMaximumBooks() {
        Person p3 = new Person();
        p3.setMaximumBooks(10);
        assertEquals(10, p3.getMaximumBooks());
    }

    public void testToString() {
        Person p4 = new Person();
        p4.setName("Fred Flintstone");
        p4.setMaximumBooks(7);
        String testString = "Fred Flintstone (7 books)";
        assertEquals(testString, p4.toString());
    }
}