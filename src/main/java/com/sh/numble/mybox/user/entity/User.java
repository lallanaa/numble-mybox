package com.sh.numble.mybox.user.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String userId;
    private String userName;
    private double usedMemory;

}
