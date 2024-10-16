package dev.mounika.JPADemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.apache.catalina.Engine;

@Entity
public class Car extends BaseModel{
    private String carname;
    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;


}
