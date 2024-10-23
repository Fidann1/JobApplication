package com.product.userservice.dto.response;

import lombok.Builder;

@Builder
public class UserSearchResponse {
    private String username;
    private String name;
    private String surname;
}
