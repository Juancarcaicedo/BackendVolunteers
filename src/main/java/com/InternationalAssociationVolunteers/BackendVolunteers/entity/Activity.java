package com.InternationalAssociationVolunteers.BackendVolunteers.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "activity")
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "activity_id")
    private Integer id;
    @Column(nullable = false, length = 255)
    private String nombre;
    private String descripcion;

}
