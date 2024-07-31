package com.example.msevent.mappers;

import com.example.msevent.dao.UserRequest;
import com.example.msevent.dao.UserResponse;
import com.example.msevent.entities.UserEntity;

import java.util.List;
import java.util.stream.Collectors;

public enum UserMapper {
    USER_MAPPER;

    public UserEntity mapToEntity(UserRequest userRequest) {
        return UserEntity.builder().
                username(userRequest.getUsername()).
                password(userRequest.getPassword()).
                age(userRequest.getAge()).build();
    }

    public UserResponse mapToResponse(UserEntity userEntity) {
        return UserResponse.builder().
                username(userEntity.getUsername()).
                password(userEntity.getPassword()).
                age(userEntity.getAge()).build();
    }
}
