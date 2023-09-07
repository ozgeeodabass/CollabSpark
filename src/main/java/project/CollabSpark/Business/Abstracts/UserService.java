package project.CollabSpark.Business.Abstracts;

import org.springframework.web.bind.annotation.PathVariable;
import project.CollabSpark.DataAccess.Abstracts.UserRepository;
import project.CollabSpark.Entities.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    User createUser(User user);
    User getUser(int id);
    User updateUser( int id, User user);
    void deleteUser(int id);
}
