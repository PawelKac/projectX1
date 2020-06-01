package company;

/**
 * Created by Kaczmarczyk on 2020-05-22.
 */
public class User {

    private long id;
    private String login;
    private String password;

    public User(Long id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public long getId() {

        return id;
    }

    public String getLogin() {

        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "company.User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


