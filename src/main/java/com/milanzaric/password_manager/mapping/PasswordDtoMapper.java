package com.milanzaric.password_manager.mapping;


import com.milanzaric.password_manager.dto.password.PasswordDTO;
import com.milanzaric.password_manager.model.Password;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface PasswordDtoMapper {

    PasswordDTO mapToPasswordDTO(Password password);
    List<PasswordDTO> mapToListPasswordDTO(List<Password> passwords);
}
