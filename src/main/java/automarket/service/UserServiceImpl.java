package automarket.service;

import automarket.model.User;
import automarket.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository repository;
    @Override
    public Integer saveUser(User user) {
        return repository.save(user).getUserID();
    }

    @Override
    public List<User> getAllUsers() {
        return (List<User>) repository.findAll();
    }

    @Override
    public User getUserById(Integer userID) {
        return repository.findById(userID).get();
    }

    @Override
    public void deleteUser(Integer userID) {
        repository.deleteById(userID);

    }
}
