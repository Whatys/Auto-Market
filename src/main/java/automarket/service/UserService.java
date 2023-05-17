package automarket.service;

import automarket.model.User;

import java.util.List;

public interface UserService {
    public Integer saveUser(User user);

    public List<User> getAllUsers();
    public User getUserById(Integer userID);
    public void deleteUser(Integer userID);
}
