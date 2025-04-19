package org.java.streams.Map;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class User {
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
}

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public User(int id, String email, String password, String userName) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.userName = userName;
    }
    private int id;
    private String userName;
    private String password;
    private String email;


}

class UserDto{
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public UserDto(int id, String email, String userName) {
        this.id = id;
        this.email = email;
        this.userName = userName;
    }

    private int id;
    private String userName;
    private String email;
}
public class MapCustomObject {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User(1, "Ramesh", "ramesh123456", "ramesh@gmail.com"));
        users.add(new User(2, "Ram", "ram123456", "ram@gmail.com"));
        users.add(new User(3, "Sanjay", "sanjay123456", "sanjay@gmail.com"));

        Stream<User> stream = users.stream();
        List<UserDto> list = stream.map(user -> new UserDto(user.getId(),user.getUserName(),user.getEmail())).toList();

        list.forEach(e->System.out.println(e));

    }
}
