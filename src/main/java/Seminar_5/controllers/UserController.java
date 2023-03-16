package Seminar_5.controllers;

import Seminar_5.model.Repository;
import Seminar_5.model.User;
import Seminar_5.model.ValidateUser;

import java.util.List;

public class UserController {
    private final Repository repository;

    private ValidateUser validator = new ValidateUser();

    public UserController(Repository repository) {
        this.repository = repository;
    }

    public void saveUser(User user) throws Exception {
        validator.check(user);
        repository.CreateUser(user);
    }

    public User readUser(String userId) throws Exception {
        User foundUser = repository.findUserById(repository.getAllUsers(), userId);
        if (foundUser != null) {
            return foundUser;
        }
        throw new Exception("User not found\n");
    }

    public List<User> readUsers() {
        List<User> users = repository.getAllUsers();
        return users;
    }

    public User deleteUser(String userId) {
        return repository.deleteUser(userId);
    }

    public void updateUser(String userId, User updatedUser) throws Exception {
        validator.check(updatedUser);
        repository.updateUser(userId, updatedUser);
    }
}