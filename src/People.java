import java.util.Scanner;

public abstract class People {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String city;

    public People(int id, String firstName, String lastName, int age, String email, String city) {
        this.id = id;
        if(firstName.equals(getClass().getName())){this.firstName = firstName;}
        else{
            System.out.println("attaryn almashtyryp jatasyz");
        }
        if(lastName.length()>2){this.lastName = lastName;}
        if(age>0&&age<110){this.age = age;}
        else {
            System.out.println("Ters san jana jok san beruugo bolboit");
        }
        if(email.contains("@")){ this.email = email;}
        else{
           System.out.println("check again");
       }
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public abstract void work();
    public abstract void ToRelax();
    public abstract void communications();
    public void timetable(){
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int b= scanner.nextInt();
        if (b>0&&b<8){
        System.out.println(getFirstName()+" "+a+" menen "+b+"/7 ishteshet");}
        else {
            System.out.println("myndai kun jumada jok");
        }
    }

    @Override
    public String toString() {
        return "Adam{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
