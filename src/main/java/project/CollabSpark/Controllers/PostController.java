package project.CollabSpark.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import project.CollabSpark.Business.Abstracts.PostService;
import project.CollabSpark.Entities.Post;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("getAllPosts/{id}")
    public List<Post> getAllPosts(@RequestParam Optional<Integer> userId){
        return this.postService.getAllPosts(userId);
    }
}
