package ClassAndObjectProgram;

public class Play {
    int id;
    String name;
    int runs;
    int wickets;

    public static void main(String[] args) {
        Play i=new Play();
        Play n=new Play();
        Play r=new Play();
        Play w=new Play();

        i.id=007;
        n.name="Dhoni";
        r.runs=101;
        w.wickets=5;

        System.out.println(i.id);
        System.out.println(n.name);
        System.out.println(r.runs);
        System.out.println(w.wickets);



    }
}
