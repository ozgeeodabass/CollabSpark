package project.CollabSpark.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "contributions")
@Data
public class Contribution {

    @Id
    private int id;

    @ManyToOne
    @JoinColumn(name = "post_id")
   private Post post;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "text",  columnDefinition = "text")
    @Lob
    private String text;
}
