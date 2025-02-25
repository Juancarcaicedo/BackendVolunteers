package com.InternationalAssociationVolunteers.BackendVolunteers.Controllers;

import com.InternationalAssociationVolunteers.BackendVolunteers.Services.IRolService;
import com.InternationalAssociationVolunteers.BackendVolunteers.Services.dto.response.RolResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/role")
@RequiredArgsConstructor
public class RoleController {
    @Autowired
    private  IRolService rolService;
    @GetMapping()
    public ResponseEntity<List<RolResponseDTO>> findAllRoles(){
        return ResponseEntity.ok(rolService.getAllRoles());
    }
}
