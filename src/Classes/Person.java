package Classes;/*
En klasse består oftest af 3 følgende ting:
1. Fields for data
2. Constructors til at lave objekter
3. Metoder f.eks. getters og setters
 */

public class Person {
    //Fields (Data elements that the class holds)
    public String name; // name of the person
    public int maximumBooks; //most books the person can check out

    //Constructors
    public Person() {
        name = "unknown name";
        maximumBooks = 3;
    }
    //Methods
    public String getName() {
        return name;
    }

    public void setName(String anyName) {
        name = anyName;
    }

    public int getMaximumBooks() {
        return maximumBooks;
    }
/*
Der er forskel på de to maximumBooks i nedstående eksempel. Den int parameter vi tager ind er en lokal variable hvor imod
this.maximumBooks refere til vores klasse parameter oppe i toppen. Navnene kan godt være ens i dette tilfælde da de henviser
til hver deres variable - this betyder at vi snakker om det her objekt.
 */
    public void setMaximumBooks(int maximumBooks) {
        this.maximumBooks = maximumBooks;
    }

    public String toString() {
        return this.getName() + " (" + this.getMaximumBooks() + " books)";
    }

}
