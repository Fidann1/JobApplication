package com.example.msevent.dao;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserResponse {

    private String username;
    private String password;
    private Integer age;
    private String email;
}
