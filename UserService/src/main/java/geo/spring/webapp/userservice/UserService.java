package geo.spring.webapp.userservice;
import java.util.List;

/**
 * Created by GEO on 29.09.15.
 */
public interface UserService {
    void create(User user);
    void delete(User user);
    User update(User user);
    User readById(Integer id);
    List<User> getAll();
}
