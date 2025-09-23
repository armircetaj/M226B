import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        Ebook ebook1 = new Ebook(Genre.FICTION, 256, true, 1, "Il Libro 1", "Giovanni Fois", 32,12);
        AudioBook abook1 = new AudioBook("Giovanni Fois", 21, "English", 2, "Il Libro 2", "Giovanni Fois", 10,15);
        DigitalMagazine digmagazine1 = new DigitalMagazine(2, LocalDate.of(2025, 2, 1), "Fiction", 3, "Il Libro 3", "Giovanni Fois", 13, 2);
        OnlineCourse course1 = new OnlineCourse("Giovanni Fois", Difficulty.INTERMEDIATE, 21, 4, "Il Libro 4", "Giovanni Fois", 10,15);

        Set<Purchasable> set = new HashSet<>();

        set.add(ebook1);
        set.add(abook1);
        set.add(digmagazine1);
        set.add(course1);
        System.out.println(set.add(ebook1)); // da false perchè lo aggiungo 2 volte


        for (Purchasable purchasable : set) {
            System.out.println(purchasable.calculatePrice());
        }
    }
}
