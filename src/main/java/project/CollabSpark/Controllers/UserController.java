package project.CollabSpark.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.CollabSpark.Business.Abstracts.UserService;
import project.CollabSpark.Entities.User;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers(){
        return this.userService.getAllUsers();
    }

    @PostMapping("/createUser")
    public User createUser(@RequestBody User newUser){
        return userService.createUser(newUser);
    }

    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable int id){
        return userService.getUser(id);
    }

    @PutMapping("/{userId}")
    public User updateUser(@PathVariable int id, @RequestBody User newUser){
        return userService.updateUser(id, newUser);
    }

    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable int id) {
         this.userService.deleteUser(id);
    }

}
