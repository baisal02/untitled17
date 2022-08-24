import java.util.Scanner;

public class Akyl extends People{
    public Akyl(int id, String firstName, String lastName, int age, String email, String city) {
        super(id, firstName, lastName, age, email, city);
    }

    @Override
    public void work() {
        System.out.println(getFirstName() + "is a cybersporstem");

    }

    @Override
    public void ToRelax() {
        System.out.println("2 ai , shaardan syrtta");
    }

    @Override
    public void communications() {
        System.out.println("introvert");
    }

}
