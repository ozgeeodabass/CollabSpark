package project.CollabSpark.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "roles")
@Data
public class Roles {

    @Id
    private int id;

    @Column(name = "role_name")
    private String roleName;

}
