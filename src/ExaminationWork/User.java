package ExaminationWork;

import java.time.LocalTime;

public class User {
    private String username;
    private String password;
    private static LocalTime creationUser;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        creationUser=LocalTime.now();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public static LocalTime getCreationUser() {
        return creationUser;
    }

    public void setCreationUser(LocalTime creationUser) {
        User.creationUser = creationUser;
    }

    @Override
    public String toString() {
        return username;
    }
}
