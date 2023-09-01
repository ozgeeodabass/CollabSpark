package project.CollabSpark.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "comments")
public class Comment {

    @Id
    private int id;
    private Post postId;
    private User userId;

    @Column(name = "text")
    @Lob
    private String text;

}
