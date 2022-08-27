package ClassAndObjectProgram;

public class Player {
     int id;
    String name;
    int runs;
    int wicket;

    public static void main(String[] args) {
      Player obj1=new Player();
      Player obj2=new Player();
      Player obj3=new Player();
      Player obj4=new Player();

      obj1.id=100;
      obj2.name="Sachin";
      obj3.runs=50;
      obj4.wicket=3;

      System.out.println(obj1.id);
      System.out.println(obj2.name);
      System.out.println(obj3.runs);
      System.out.println(obj4.wicket);
    }




}
