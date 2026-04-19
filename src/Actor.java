import java.util.Objects;

public class Actor extends Person {
    int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Актёр - " + name + " " + surname + ", Рост (" + height + " см.).";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Actor actor)) return false;
        return Objects.equals(name, actor.name)
                && Objects.equals(surname, actor.surname)
                && gender == actor.gender
                && height == actor.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gender, height);
    }
}
