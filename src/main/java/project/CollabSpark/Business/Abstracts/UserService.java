package project.CollabSpark.Business.Abstracts;

import project.CollabSpark.DataAccess.Abstracts.UserRepository;
import project.CollabSpark.Entities.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
}
