package com.revature.myuser.controller;

import com.revature.myuser.model.MyUser;
import com.revature.myuser.service.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/myuser")
public class MyUserController {

    @Autowired
    MyUserService myUserService;

    @PostMapping
    public void createNewUser(@RequestBody MyUser myuser){
        System.out.println("asdf");
        myUserService.createNewUser(myuser);
    }

    @GetMapping
    public List<MyUser> getAllUsers(){
        return myUserService.getAllUsers();
    }

    @GetMapping("/{id}")
    public MyUser findUserById(@PathVariable Integer id){
        return myUserService.findUserById(id);
    }
}
