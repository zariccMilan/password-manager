package com.milanzaric.password_manager.mapping;


import com.milanzaric.password_manager.dto.user.UserDTO;
import com.milanzaric.password_manager.model.User;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface UserDtoMapper {

    UserDTO mapToUserDTO(User user);
    List<UserDTO> mapToListUserDTO(List<User> users);
}
