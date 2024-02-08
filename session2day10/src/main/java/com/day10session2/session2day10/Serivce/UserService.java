package com.day10session2.session2day10.Serivce;

import java.util.List;

import com.day10session2.session2day10.Entity.UserDetail;

//import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

public interface UserService {
    public UserDetail addUser(UserDetail userDetail);
    public List<UserDetail> getAll();
}
