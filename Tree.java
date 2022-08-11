import java.util.ArrayList;
import java.util.List;
/**
 * Класс, являющийся наследником класса Relationship и создающий массив связей между людьми.
 */
public class Tree extends Relationship {

    public Tree(Person one, Person two, Relation rel) {
        super(one, two, rel);
    }
   
    static List<Relationship> tree = new ArrayList<>();
    {
        for (int i = 0; i < Relationship.number; i++) {
            tree.add(new Relationship(one, two, rel));
       }
    }

    public static void getTree() {
        for (int i = 0; i < tree.size(); i++) {
            System.out.println(tree.get(i));
        }
    }
}
