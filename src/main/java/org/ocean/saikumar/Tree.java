package org.ocean.saikumar;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tree")
@Data
public class Tree {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
}
