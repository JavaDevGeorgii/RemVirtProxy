package geo.spring.webapp.userserviceproxy;

import geo.spring.webapp.userservice.User;

/**
 * Created by GEO on 29.09.15.
 */
public class Main {

    public static void main(String []args){
        UserServiceProxy userServiceProxy =new UserServiceProxy();

        userServiceProxy.create(new User(1,"Ivan","Sidorov"));
        userServiceProxy.create(new User(2,"Jan","Flemming"));
        userServiceProxy.create(new User(3,"Liza","Vong"));

        System.out.println(userServiceProxy.getAll());
        //List<User> userList=new ArrayList<>();

        System.out.println();
    }
}
