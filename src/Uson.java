import java.util.Scanner;

public class Uson extends People{
    public Uson(int id, String firstName, String lastName, int age, String email, String city) {
        super(id, firstName, lastName, age, email, city);
    }

    @Override
    public void work() {
        System.out.println(getFirstName()+"is an engeneer");
    }

    @Override
    public void ToRelax() {
        System.out.println("hawaii , 2 ai");
    }

    @Override
    public void communications() {
        System.out.println("govorit tolko s znakomymi");
    }


}
