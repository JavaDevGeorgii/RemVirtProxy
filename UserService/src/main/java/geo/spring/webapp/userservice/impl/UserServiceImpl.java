package geo.spring.webapp.userservice.impl;

import geo.spring.webapp.userservice.User;
import geo.spring.webapp.userservice.UserService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GEO on 29.09.15.
 */
@Component("userService")
public class UserServiceImpl implements UserService{

    List<User> users=new ArrayList<User>();

    @Override
    public void create(User user) {
        users.add(new User(user));
    }

    @Override
    public void delete(User user) {
        for(int i=0; i<users.size(); i++){
            if(users.get(i).equals(user)){
                users.remove(i);
                return;
            }
        }
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public User readById(Integer id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return users;
    }
}
