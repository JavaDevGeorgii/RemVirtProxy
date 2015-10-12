package geo.spring.webapp.userserviceproxy;

import geo.spring.webapp.userservice.User;
import geo.spring.webapp.userservice.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by GEO on 29.09.15.
 */
@Component("userServiceProxy")
public class UserServiceProxy implements UserService {

    ApplicationContext context;

    UserService userService;

    public UserServiceProxy() {
        try {
            context = new ClassPathXmlApplicationContext("userService-context.xml");
            userService = (UserService) context.getBean("userService");
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println(ex.toString());
        }
    }

    private UserServiceProxy proxy;


    public void create(User user) {
        if (userService != null) {
            userService.create(user);
        } else {
            System.out.println("Context don`t getUp :(    userService.create(user)");
        }
    }

    public void delete(User user) {
        if (userService != null) {
            userService = (UserService) context.getBean("userService");
            userService.delete(user);
        } else {
            System.out.println("Context don`t getUp :(    userService.delete(user)");
        }
    }

    public User update(User user) {
        if (userService != null) {
            userService = (UserService) context.getBean("userService");
            return userService.update(user);
        } else {
            System.out.println("Context don`t getUp :(  userService.update(user)");
            return null;
        }

    }

    public User readById(Integer id) {
        if (userService != null) {
            userService = (UserService) context.getBean("userService");
            return userService.readById(id);
        } else {
            System.out.println("Context don`t getUp :(   userService.readById(id)");
            return null;
        }
    }

    public List<User> getAll() {
        if (userService != null) {
            userService = (UserService) context.getBean("userService");
            return userService.getAll();
        } else {
            System.out.println("Context don`t getUp :(   userService.getAll()");
            return null;
        }
    }

}
