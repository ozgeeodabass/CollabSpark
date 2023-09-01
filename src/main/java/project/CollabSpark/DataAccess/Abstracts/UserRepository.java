package project.CollabSpark.DataAccess.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import project.CollabSpark.Entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {


}
