package com.milanzaric.password_manager.service.impl;


import com.milanzaric.password_manager.dto.password.PasswordDTO;
import com.milanzaric.password_manager.mapping.PasswordDtoMapper;
import com.milanzaric.password_manager.model.Password;
import com.milanzaric.password_manager.repository.mapper.PasswordMapper;
import com.milanzaric.password_manager.service.PasswordService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PasswordServiceImpl implements PasswordService {

    private final PasswordMapper passwordMapper; // MyBatis
    private final PasswordDtoMapper passwordDtoMapper; // MapStruct bean


    @Override
    public List<PasswordDTO> getAllPasswords() {
        List<Password> passwords = passwordMapper.findAll();
        System.out.println(passwords.get(0).getId());
        System.out.println(passwords.get(0).getUserId());
        return passwordDtoMapper.mapToListPasswordDTO(passwords);
    }
}
