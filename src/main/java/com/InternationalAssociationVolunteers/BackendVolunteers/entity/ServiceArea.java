package com.InternationalAssociationVolunteers.BackendVolunteers.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "service_area")
@Data
public class ServiceArea {
    @Id
    @Column(name = "service_area_id")
    private  Integer id;
    @Column(nullable = false, length = 255)
    private  String name;
}
