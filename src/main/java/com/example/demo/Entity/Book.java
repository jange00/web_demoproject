package com.example.demo.Entity;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "books")
public class Book {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_seq_gen")
    @SequenceGenerator(name = "book_seq_gen", sequenceName = "book_setup_seq", allocationSize = 1)
    @Id
    private Long id;

    @Column(name = "booking_type")
    private String booking_type;

    @Column(name = "author")
    private Date bookingtime;

    @Column(name = "time")
    private String time;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "book_id"))
    private Book bookId;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "user_user_id"))
    private Users user;
}
