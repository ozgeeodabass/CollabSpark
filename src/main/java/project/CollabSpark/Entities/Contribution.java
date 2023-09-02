package project.CollabSpark.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "contributions")
@Data
public class Contribution {

    @Id
    private int id;

    private Post postId;

    private User userId;

    @Column(name = "text",  columnDefinition = "text")
    @Lob
    private String text;
}
