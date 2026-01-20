import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {
    private List<User> users = new ArrayList<>();

    public UserRepository(User user1, User user2, User user3) {
        this.users.add(user1);
        this.users.add(user2);
        this.users.add(user3);

    }
    Optional<User> findById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }
}
