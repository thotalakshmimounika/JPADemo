package dev.mounika.JPADemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity

public class Brand extends BaseModel {
    private String brandname;
    @OneToMany(mappedBy = "brand")
    private List<Car> cars;
}
