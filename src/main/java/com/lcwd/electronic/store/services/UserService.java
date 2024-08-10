package com.lcwd.electronic.store.services;

import com.lcwd.electronic.store.dtos.PageableResponse;
import com.lcwd.electronic.store.dtos.UserDto;

import java.util.List;

public interface UserService {
    //creatUser
    UserDto createUser(UserDto userDto);

    //updateUser
    UserDto updateUser(UserDto userDto, String userId);

    //DeleteUser
   void deleteUser(String userId);

    //GetAllUser
    PageableResponse<UserDto> getAllUsers(int pageNumber, int pageSise, String sortBy, String sortDir);

      //GetSingleUserById
    UserDto getUserById(  String userId);


    //GetSingleUserByEmail
    UserDto getUserByEmail( String email);

    //Search
    List<UserDto> searchUser(String keyword);
}
