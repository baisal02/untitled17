import java.util.Scanner;

public class Asan extends People{

    public Asan(int id, String firstName, String lastName, int age, String email, String city) {
        super(id, firstName, lastName, age, email, city);
    }

    @Override
    public void work() {
        System.out.println(getFirstName()+" is a programmer");
    }

    @Override
    public void ToRelax() {
        System.out.println("julyna 1 ai es alat, mayamide");
    }

    @Override
    public void communications() {
        System.out.println("kommunicabelnyi");
    }


}
