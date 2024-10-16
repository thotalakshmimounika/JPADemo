package dev.mounika.JPADemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;

import java.util.List;
@Entity
public class Person extends BaseModel{
    private String name;
    @ManyToMany(mappedBy = "people",fetch = FetchType.LAZY)
    private List<Course> courses;
}
