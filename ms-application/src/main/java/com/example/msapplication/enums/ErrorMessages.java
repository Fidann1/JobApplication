package com.example.msapplication.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorMessages {
    APPLICATION_NOT_FOUND("Application not found with given id : %s");

    private final String message;

}
