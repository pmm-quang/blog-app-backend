package com.example.blogapp.services;

import com.example.blogapp.entities.User;
import com.example.blogapp.payloads.UserDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface UserService {
    UserDto registerNewUser(UserDto userDto);
    UserDto createUser(UserDto userDto);
    UserDto updateUser(UserDto userDto, Integer userId);
    UserDto getUserById(Integer userId);
    List<UserDto> getAllUser();
    void deleteUser(Integer userId);

}
