package com.InternationalAssociationVolunteers.BackendVolunteers.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Agreement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "user_position_id", nullable = false)
    private UserPosition userPosition;
    @Column(nullable = false)
    private String description;
}
