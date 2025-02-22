package com.InternationalAssociationVolunteers.BackendVolunteers.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Bulletin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String pdfUrl;
}
