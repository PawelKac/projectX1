
/**
 * Created by Kaczmarczyk on 2020-04-22.
 */

import entity.User;
import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    void addUser(User user);
    void removeUserById(Long userId);

}
