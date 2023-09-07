package project.CollabSpark.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.List;

@Entity
@Data
@Table(name = "posts")
public class Post {

    @Id
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE) //if a user deleted, then all posts are also deleted
    @JsonIgnore
    private User user;

    @Column(name = "title")
    @Size(max = 255, message = "Title must be less than 255 characters")
    private String title;

    @Column(name = "text", columnDefinition = "text")
    @Lob
    private String text;

    @OneToMany(mappedBy = "post")
    private List<Like> likes;

    @OneToMany(mappedBy = "post")
    private List<Contribution> contributions;

    @OneToMany(mappedBy = "post")
    private List<Comment> comments;
}
