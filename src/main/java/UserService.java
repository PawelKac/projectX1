package api;

/**
 * Created by Kaczmarczyk on 2020-05-22.
 */
import company.User;
import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void addUser(User user);
    void removeUserById(Long userId);
}
