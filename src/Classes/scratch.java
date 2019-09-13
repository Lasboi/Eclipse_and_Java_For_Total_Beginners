package Classes;
import java.util.*;

class Scratch {
    public static void main(String[] args) {
        int a = 5;
        a = a * 10;
        System.out.println(a);
        System.out.println("Hello World");

        Person p = new Person();
        p.setName("Fred");
        p.setMaximumBooks(10);
        p.getMaximumBooks();
        p.toString();

        //I en ArrayList<> er den data som vi ønsker vores Array skal indenholde angivet imellem <> feks ArrayList<int>
        ArrayList<Book> list = new ArrayList<Book>();

        Book b1 = new Book("Great Expectations");
        Book b2 = new Book("War and Peace");
        list.add(b1);
        list.add(b2);

        Person p1 = new Person();
        p1.setName("Fred");
        b1.setPerson(p1);

        System.out.println(list.get(0).getPerson().getName());
        list.indexOf(b2);
        list.remove(b1);
    }
}