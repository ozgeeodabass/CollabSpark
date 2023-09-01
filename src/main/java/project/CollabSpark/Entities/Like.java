package project.CollabSpark.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "likes")
public class Like {

    @Id
    private int id;
    private Post postId;

    private User userId;

}
