package project.CollabSpark.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    //posts and posts?Id=1 urlleri için
    @GetMapping()
    public List<Post> getAllPosts(@RequestParam Optional<Integer> userId){
        return this.postService.getAllPosts(userId);
    }

    @GetMapping("/getPost/{postId}")
    public Post getPost(@PathVariable Integer postId){
        return this.postService.getPost(postId);
    }

    @PostMapping("/createOnePost")
    public Post createOnePost(@RequestBody Post newPost){
        return this.postService.createOnePost(newPost);
    }

}
