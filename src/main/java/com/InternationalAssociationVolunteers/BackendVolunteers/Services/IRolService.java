package com.InternationalAssociationVolunteers.BackendVolunteers.Services;

import com.InternationalAssociationVolunteers.BackendVolunteers.Services.dto.response.RolResponseDTO;

import java.util.List;

public interface IRolService {
    List<RolResponseDTO>getAllRoles();
}
