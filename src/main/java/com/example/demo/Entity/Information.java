package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="Information")
public class Information {
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "information_seq_gen")

    @SequenceGenerator(name = "information_seq_gen",
            sequenceName = "information_seq", allocationSize = 1)
    @Id
    private Integer id;

    @Column(name = "infromation_name", nullable = false, length = 100)
    private String name;

    @Column(name = "age",length = 10,nullable = false)
    private Integer age;
}
