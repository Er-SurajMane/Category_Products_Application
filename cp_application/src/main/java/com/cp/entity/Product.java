package com.cp.entity;

import jakarta.persistence.*;
import lombok.*;
import com.fasterxml.jackson.annotation.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;

    @ManyToOne(cascade = CascadeType.ALL)
    private Category category;
}
