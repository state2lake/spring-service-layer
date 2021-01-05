package com.example.test1.testing1;

import javax.persistence.PostLoad;

import com.example.test1.testing1.DTO.UserDTO;
import com.example.test1.testing1.RequestModel.UserDetailsRequestModel;
import com.example.test1.testing1.ResponseModel.UserRest;
import com.example.test1.testing1.Service.Interface.IUserService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserConntrolV1 {

    @Autowired
    IUserService userService;

    @GetMapping
    public String GetUser() {
        return "Get user called";
    }

    @PostMapping
    public UserRest CreateUser(@RequestBody UserDetailsRequestModel userDetails) {
        
        UserRest returnValue = new UserRest(); 

        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(requestUserDetails, userDTO);

        UserDTO createdUser = userService.createUser(userDTO);
        BeanUtils.copyProperties(createdUser, returnValue);


        return returnValue;
    }

    @PutMapping
    public String UpdateUser() {
        return "Update user called";
    }

    @DeleteMapping
    public String DeleteUser() {
        return "Delete user called";
    }
}
