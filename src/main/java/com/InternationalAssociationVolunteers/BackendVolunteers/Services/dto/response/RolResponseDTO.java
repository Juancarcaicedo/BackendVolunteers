package com.InternationalAssociationVolunteers.BackendVolunteers.Services.dto.response;


public class RolResponseDTO {
    private  Long id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
