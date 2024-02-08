package com.day10session2.session2day10.Serivce;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.day10session2.session2day10.Entity.UserDetail;
@Service
public class UserServiceImpl implements UserService{
       private List<UserDetail> list=new ArrayList<>();
    @Override
    public UserDetail addUser(UserDetail userDetail) {

          list.add(userDetail);
          return userDetail;
    }

    @Override
    public List<UserDetail> getAll() {
        return list;
    }
    
}
