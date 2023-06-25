package com.gachon.healthdiary.data.entity;

import lombok.*;

import javax.persistence.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)

@Table(name="diet")
public class Diet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column(nullable=false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Float calorie;




}