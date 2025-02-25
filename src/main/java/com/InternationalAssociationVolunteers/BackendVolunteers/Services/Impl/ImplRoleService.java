package com.InternationalAssociationVolunteers.BackendVolunteers.Services.Impl;

import com.InternationalAssociationVolunteers.BackendVolunteers.Repositories.RolRepository;
import com.InternationalAssociationVolunteers.BackendVolunteers.Services.IRolService;
import com.InternationalAssociationVolunteers.BackendVolunteers.Services.dto.response.RolResponseDTO;
import com.InternationalAssociationVolunteers.BackendVolunteers.entity.Role;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ImplRoleService implements IRolService {
    @Autowired
    private  ModelMapper modelMapper;
    @Autowired
    private RolRepository rolRepository;
    @Override
    public List<RolResponseDTO> getAllRoles() {
        List<Role> roles = rolRepository.findAll();
        if(roles.isEmpty()){
            //agregar excepcion personalizada falta
            throw  new RuntimeException("No se encontraron registros de roles en la base de datos ");
        }
        return  roles.stream().map(role -> modelMapper.map(role,RolResponseDTO.class)).collect(Collectors.toList());
    }
}
