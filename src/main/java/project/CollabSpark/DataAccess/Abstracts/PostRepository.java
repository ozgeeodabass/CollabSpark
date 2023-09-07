package project.CollabSpark.DataAccess.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import project.CollabSpark.Entities.Post;

public interface PostRepository extends JpaRepository<Integer, Post> {
}
