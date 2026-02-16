package com.milanzaric.password_manager.controller;


import com.milanzaric.password_manager.dto.password.PasswordDTO;
import com.milanzaric.password_manager.service.impl.PasswordServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/password-manager/passwords")
public class PasswordController {

    private final PasswordServiceImpl passwordServiceImpl;

    @GetMapping
    public ResponseEntity<List<PasswordDTO>> getAllPasswords() {
        List<PasswordDTO> passwordDTOs = passwordServiceImpl.getAllPasswords();
        return new ResponseEntity<>(passwordDTOs, HttpStatus.OK);
    }

}
