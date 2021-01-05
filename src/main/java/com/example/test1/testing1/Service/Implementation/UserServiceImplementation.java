package com.example.test1.testing1.Service.Implementation;

import com.example.test1.testing1.DTO.UserDTO;
import com.example.test1.testing1.Service.Interface.IUserService;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements IUserService{
    
    @Override
    public UserDTO createUser(UserDTO user) {
        return null;
    }
}
