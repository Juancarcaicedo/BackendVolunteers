package com.InternationalAssociationVolunteers.BackendVolunteers.Repositories;

import com.InternationalAssociationVolunteers.BackendVolunteers.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepository extends JpaRepository<Role, Long> {
}
