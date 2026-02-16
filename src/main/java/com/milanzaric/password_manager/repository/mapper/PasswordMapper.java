package com.milanzaric.password_manager.repository.mapper;


import com.milanzaric.password_manager.model.Password;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Mapper
public interface PasswordMapper {

    List<Password> findAll();
    Optional<Password> findById(UUID id);
    void insert(Password password);
    void update(Password password);
    void delete(UUID id);
}
