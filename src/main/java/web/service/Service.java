package web.service;

import web.model.User;

import java.util.List;

public interface Service {
    List<User> getUserList();
    void addUser(User user);
    void deleteUser(long id);
    void changeUser(User user);




}
