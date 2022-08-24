import java.util.Scanner;

public class Ainur extends People{
    public Ainur(int id, String firstName, String lastName, int age, String email, String city) {
        super(id, firstName, lastName, age, email, city);
    }

    @Override
    public void work() {
        System.out.println(getFirstName()+"is a designer");
    }

    @Override
    public void ToRelax() {
        System.out.println("20 kun, Yssuk-Kul");
    }

    @Override
    public void communications() {
        System.out.println("extrovert");
    }

}
