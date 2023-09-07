package project.CollabSpark.Business.Abstracts;

import project.CollabSpark.Entities.Post;

import java.util.List;
import java.util.Optional;

public interface PostService {
    List<Post> getAllPosts(Optional<Integer> userId);
    Post getPost(Integer postId);

    Post createOnePost(Post newPost);
}
