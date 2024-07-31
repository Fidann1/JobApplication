package com.example.msevent.services.serviceImpls;

import com.example.msevent.dao.UserRequest;
import com.example.msevent.dao.UserResponse;
import com.example.msevent.mappers.UserMapper;
import com.example.msevent.repositories.UserRepository;
import com.example.msevent.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.msevent.mappers.UserMapper.USER_MAPPER;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void saveUser(UserRequest userRequest) {
        userRepository.save(USER_MAPPER.mapToEntity(userRequest));
    }

    @Override
    public List<UserResponse> findAllUsers() {
        return userRepository.findAll().stream().map(USER_MAPPER::mapToResponse).toList();
    }

    @Override
    public UserResponse findUserById(Long id) {
        return USER_MAPPER.mapToResponse(userRepository.findById(id).orElse(null));
    }
}
