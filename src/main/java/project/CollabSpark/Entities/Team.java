package project.CollabSpark.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "teams")
public class Team {

    @Id
    private int id;

    @Column(name = "team_title")
    private String teamTitle;

    @OneToMany(mappedBy = "team")
    private List<User> employees;


}
