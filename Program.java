public class Program {

    public static void main(String[] args) {
      Person Ivan = new Person("Иван", "Егоров");
      Person Olga = new Person("Ольга", "Егорова");
      Person Pavel = new Person("Павел", "Егоров");
      Person Dmitriy = new Person("Дмитрий", "Егоров");
      Person Tatyana = new Person("Татьяна", "Федорова");

      Relationship brother_one = new Relationship(Dmitriy, Pavel, Relation.brothers);
      Relationship brother_two = new Relationship(Pavel, Dmitriy, Relation.brothers);
      Relationship husban = new Relationship(Ivan, Olga, Relation.husban);
      Relationship wife = new Relationship(Olga, Ivan, Relation.wife);
      Relationship son_one = new Relationship(Pavel, Ivan, Relation.son);
      Relationship son__one = new Relationship(Pavel, Olga, Relation.son);
      Relationship son_two = new Relationship(Dmitriy, Olga, Relation.son);
      Relationship son__two = new Relationship(Dmitriy, Ivan, Relation.son);
      Relationship aunt_son_one = new Relationship(Pavel, Tatyana, Relation.aunt);
      Relationship aunt_son_two = new Relationship(Dmitriy, Tatyana, Relation.aunt);
      Relationship sister = new Relationship(Tatyana, Olga, Relation.sister);
      Relationship sister_ = new Relationship(Olga,Tatyana, Relation.sister);
     // Tree.getTree();
    }

}