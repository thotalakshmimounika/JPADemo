package dev.mounika.JPADemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Team extends BaseModel{
    private String teamname;
    @OneToOne(mappedBy = "team",fetch = FetchType.EAGER)
    private TeamDetails details;
}
