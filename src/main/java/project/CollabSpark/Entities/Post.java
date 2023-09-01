package project.CollabSpark.Entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;
@Entity
@Data
@Table(name = "posts")
public class Post {

    @Id
    private int id;

    private User userId;

    @Column(name = "title")
    @Size(max = 255, message = "Title must be less than 255 characters")
    private String title;

    @Column(name = "text", columnDefinition = "text")
    @Lob
    private String text;

}
