package com.InternationalAssociationVolunteers.BackendVolunteers.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name = "position")
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "position_id")
    private  Long id;
    @Column(nullable = false)
    private  String name;
    @ManyToOne
    @JoinColumn(name = "service_area_id", nullable = false)
    private ServiceArea serviceArea;
    @ManyToMany
    @JoinTable(
            name = "activity_position",
            joinColumns = @JoinColumn(name = "position_id"),
            inverseJoinColumns = @JoinColumn(name = "activity_id")
    )
    private Set<Activity> actividades;



}
