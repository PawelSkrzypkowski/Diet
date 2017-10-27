package pl.pawelskrzypkowski.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Paweł on 12.09.2017.
 */
@Data
@Entity
public class UserRole {

    @Id
    @GeneratedValue
    private Long id;
    private String role;
    private String description;
}
