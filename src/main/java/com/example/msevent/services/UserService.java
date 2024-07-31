package com.example.msevent.services;


import com.example.msevent.dao.UserRequest;
import com.example.msevent.dao.UserResponse;
import com.example.msevent.entities.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    void saveUser(UserRequest userRequest);
    List<UserResponse> findAllUsers();
    UserResponse findUserById(Long id);



}
