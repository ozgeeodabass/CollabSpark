package project.CollabSpark.Business.Concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.CollabSpark.Business.Abstracts.UserService;
import project.CollabSpark.DataAccess.Abstracts.UserRepository;
import project.CollabSpark.Entities.User;

import java.util.List;

@Service
public class UserManager implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserManager(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }
}
