package project.CollabSpark.Business.Concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.CollabSpark.Business.Abstracts.PostService;
import project.CollabSpark.DataAccess.Abstracts.PostRepository;
import project.CollabSpark.Entities.Post;

import java.util.List;
import java.util.Optional;

@Service
public class PostManager implements PostService {

    public PostRepository postRepository;

    @Autowired
    public PostManager(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<Post> getAllPosts(Optional<Integer> userId) {
        if(userId.isPresent()){
            return this.postRepository.findByUserId(userId.get());
        }
        return this.postRepository.findAll();
    }

    @Override
    public Post getPost(Integer postId) {
        return this.postRepository.findById(postId).orElse(null);
    }

    @Override
    public Post createOnePost(Post newPost) {
        return this.postRepository.save(newPost);
    }
}
