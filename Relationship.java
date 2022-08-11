/**
 * Класс, показывающий связи между людьми
 */
public class Relationship {

    public Relation rel;
    public Person one;
    public Person two;
    public static Integer number = 0;

    public Relationship(Person one, Person two, Relation rel) {
        this.one = one;
        this.two = two;
        this.rel = rel;
        number += 1;
    }

    public static Integer getNumber() {
        return number;
    }

}