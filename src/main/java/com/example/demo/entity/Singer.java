package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Singer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String name;
}
