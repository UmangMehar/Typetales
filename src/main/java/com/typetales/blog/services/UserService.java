package com.typetales.blog.services;


import com.typetales.blog.payloads.UserDto;

import java.util.List;

public interface UserService {

    UserDto createUser(UserDto user );
    UserDto updateUser(UserDto user,Integer userId);
    UserDto getUser(Integer userId);
    List<UserDto> getAllUsers();
    void deleteUser(Integer userId);
}
