package project.CollabSpark.DataAccess.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import project.CollabSpark.Entities.Post;

import java.util.List;
import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Integer> {
    List<Post> findByUserId(Integer userId);
}
