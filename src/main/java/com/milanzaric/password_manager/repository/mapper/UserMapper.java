package com.milanzaric.password_manager.repository.mapper;


import com.milanzaric.password_manager.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.UUID;

@Mapper
public interface UserMapper {

    List<User> findAll();
    User findById(UUID id);
    void insert(User user);
    void update(User user);
    void delete(UUID id);
}
