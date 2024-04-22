package com.example.demo.Entity;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "Context")

public class Context {
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "context_seq_gen")

    @SequenceGenerator(name = "context_seq_gen",
            sequenceName = "context_seq", allocationSize = 1)
    @Id
    private Integer id;

    @Column(name = "context_name", nullable = false,length = 100)
    private String name;


    //Many to one
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "information_id", referencedColumnName = "id",
//            foreignKey = @ForeignKey(name = "pk_information_id_fk_information_id"))
//    private Information Information;

    //Many to many
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "context_information",
            foreignKey = @ForeignKey(name = "FK_context_information_context_id"),
            joinColumns = @JoinColumn(name = "context_id", referencedColumnName = "id"),
            inverseForeignKey = @ForeignKey(name = "FK_context_informations_information_Id"),
            inverseJoinColumns = @JoinColumn(name = "information_id", referencedColumnName = "id"),
            uniqueConstraints = @UniqueConstraint(name = "UNIQUE_context_information_informationId",
                    columnNames = {"contextid", "information_id"})
    )
    private Collection<Information> information;
}
