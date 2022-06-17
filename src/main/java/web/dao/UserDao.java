package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getUserList();
    void addUser(User user);
    void deleteUser(long id);
    void changeUser(User user);
}
