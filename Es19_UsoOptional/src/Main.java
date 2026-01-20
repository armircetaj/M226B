import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "Gio");
        User user2 = new User(2, "Pio");
        User user3 = new User(3, "Bio");
        User user4 = new User(4, "Lio");
        User user5 = new User(5, "Tio");
        User user6 = new User(6, "Rio");
        User user7 = new User(7, "Kio");
        User user8 = new User(8, "Cio");
        User user9 = new User(9, "Sio");
        User user10 = new User(10, "Fio");
        UserRepository usr = new UserRepository(user1, user2, user3);
        for(int i=1;i<=10;i++) {
            Optional<User> opt = usr.findById(i);
            if(opt.isPresent()) {
                System.out.println(opt.get());
            }
            else {
                System.out.println("Utente non trovato");
            }
        }

    }
}
