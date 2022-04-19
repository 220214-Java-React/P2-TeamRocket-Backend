package com.revature.myuser.service;

import com.revature.myuser.model.MyUser;
import com.revature.myuser.repository.MyUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Service
public class MyUserService {

    @Autowired
    MyUserRepository myUserRepository;

    public List<MyUser> getAllUsers(){
        return myUserRepository.findAll();
    }

    public MyUser findUserById(Integer id){

        return myUserRepository.findById(id).orElse(new MyUser()); // returns an optional that we need to unwrap
//        User user = userRepository.getById(id);
//        return user;
    }

    public void createNewUser(MyUser myuser){
        myUserRepository.save(myuser);
    }
}
