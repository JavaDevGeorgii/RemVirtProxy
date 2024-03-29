package geo.spring.webapp.userservice;

/**
 * Created by GEO on 29.09.15.
 */
public class User {
    private Integer id;
    private String firstName;
    private String lastName;

    public User() {
    }

    public User(User user) {
        this.id=user.getId();
        this.firstName=user.getFirstName();
        this.lastName=user.getLastName();
    }

    public User(Integer id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}'+'\n';
    }
}
