package project.CollabSpark.Business.Concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.CollabSpark.Business.Abstracts.UserService;
import project.CollabSpark.DataAccess.Abstracts.UserRepository;
import project.CollabSpark.Entities.User;

import java.util.List;
import java.util.Optional;

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

    @Override
    public User createUser(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public User getUser(int id) {
        //add custom exception
        return this.userRepository.findById(id).orElse(null);
    }

    @Override
    public User updateUser(int id, User newUser) {
        Optional<User> user = this.userRepository.findById(id);
        if(user.isPresent()){
            User foundUser = user.get();
            foundUser.setUserName(newUser.getUserName());
            foundUser.setPassword(newUser.getPassword());
            foundUser.setFirstName(newUser.getFirstName());
            foundUser.setLastName(newUser.getLastName());
            this.userRepository.save(foundUser);
            return foundUser;
        }else
            return null;

    }
    @Override
    public void deleteUser(int id) {
        //business rules
        if(this.userRepository.findById(id).isPresent()){
            this.userRepository.deleteById(id);
            System.out.println(id+" idli kullanıcı başarıyla silindi");
        }else {
            System.out.println(id+" idli bir kullanıcı bulunamadı");
        }

    }
}
