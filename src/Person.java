public class Person {
    private String name;
    String surname;
    Gender gender;

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
}
