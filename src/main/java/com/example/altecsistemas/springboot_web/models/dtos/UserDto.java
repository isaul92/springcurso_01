package com.example.altecsistemas.springboot_web.models.dtos;

import com.example.altecsistemas.springboot_web.models.User;

import lombok.Getter;
import lombok.Setter;

public class UserDto {
    @Getter
    @Setter
    private String title;
    @Getter
    @Setter
    private User user;


}
