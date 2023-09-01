package project.CollabSpark.Business.Concretes;

import org.springframework.beans.factory.annotation.Autowired;
import project.CollabSpark.Business.Abstracts.UserService;
import project.CollabSpark.DataAccess.Abstracts.UserRepository;

public class UserManager implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserManager(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
