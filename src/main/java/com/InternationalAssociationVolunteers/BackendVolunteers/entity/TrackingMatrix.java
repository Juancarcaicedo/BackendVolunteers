package com.InternationalAssociationVolunteers.BackendVolunteers.entity;

import com.InternationalAssociationVolunteers.BackendVolunteers.entity.Enums.ActivityState;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "tracking_matrix")
@Data
public class TrackingMatrix {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tracking_matrix_id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "user_position_id", nullable = false)
    private UserPosition userPosition;

    @ManyToOne
    @JoinColumn(name = "activity_id", nullable = false)
    private Activity activity;

    @ManyToOne
    @JoinColumn(name = "delegated_by", nullable = false)
    private User delegateBy;

    @Column(name = "assignment_date")
    private LocalDate fechaAsignacion;

    @Column(name = "proposed_end_date")
    private LocalDate proposedEndDate;
    @Enumerated(EnumType.STRING)
   private ActivityState activityState;



}
