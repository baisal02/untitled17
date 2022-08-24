import java.util.Scanner;

public class Adyl extends People{
    public Adyl(int id, String firstName, String lastName, int age, String email, String city) {
        super(id, firstName, lastName, age, email, city);
    }

    @Override
    public void work() {
        System.out.println(getFirstName()+"is a teacher");
    }

    @Override
    public void ToRelax() {
        System.out.println("gory , 2,5 ai");
    }

    @Override
    public void communications() {
        System.out.println("baary menen jakshy");
    }


}
