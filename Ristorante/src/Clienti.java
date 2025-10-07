import java.util.Objects;

public class Clienti {
    private String name;
    private String surname;
    private int age;
    public Clienti(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public String getName() {
        return name + " " + surname;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Clienti clienti = (Clienti) o;
        return age == clienti.age && Objects.equals(name, clienti.name) && Objects.equals(surname, clienti.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }
}
