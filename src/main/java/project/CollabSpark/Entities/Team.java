package project.CollabSpark.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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

    //relation
    private List<User> employees;


    //relation
    private User leader;


}
