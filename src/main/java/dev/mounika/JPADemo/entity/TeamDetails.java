package dev.mounika.JPADemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class TeamDetails extends BaseModel{
    private String teamdetails;
    @OneToOne
    @JoinColumn(name = "team_Id")
    private Team team;
}
