package com.InternationalAssociationVolunteers.BackendVolunteers.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
@Data
@PrimaryKeyJoinColumn(name = "person_id")
public class User extends  Person {
    @Column(nullable = false, unique = true, length = 50)
    private  String username;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private Boolean status;
    @ManyToMany
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(name = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "rol_id")
    )
    private Set<Role> roles = new HashSet<>();

}
