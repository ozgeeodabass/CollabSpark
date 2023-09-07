package project.CollabSpark.Business.Concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.CollabSpark.Business.Abstracts.PostService;
import project.CollabSpark.DataAccess.Abstracts.PostRepository;

@Service
public class PostManager implements PostService {

    public PostRepository postRepository;

    @Autowired
    public PostManager(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
}
