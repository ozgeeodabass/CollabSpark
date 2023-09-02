package project.CollabSpark.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.CollabSpark.Business.Abstracts.UserService;
import project.CollabSpark.Entities.User;

import java.util.List;

@RestController
@RequestMapping(name = "/users")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getAllUsers")
    public List<User> getAllUser(){
        return this.userService.getAllUsers();
    }

}
