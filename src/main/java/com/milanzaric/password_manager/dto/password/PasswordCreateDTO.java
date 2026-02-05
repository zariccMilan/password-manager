package com.milanzaric.password_manager.dto.password;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PasswordCreateDTO {

    private String passwordHash;
    private UUID userId;
}
