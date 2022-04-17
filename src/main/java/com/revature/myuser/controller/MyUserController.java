package com.revature.myuser.controller;

import com.revature.myuser.model.MyUser;
import com.revature.myuser.service.MyUserService;
import org.mindrot.jbcrypt.BCrypt;
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
        myuser.setPwd(BCrypt.hashpw(myuser.getPwd(), BCrypt.gensalt()));
        myUserService.createNewUser(myuser);
    }

    @PostMapping("/checkpwd")
    public boolean checkPassword(@RequestBody MyUser temp){
        System.out.println(temp);
        MyUser myuser = myUserService.findUserById(temp.getId());

        return BCrypt.checkpw(temp.getPwd(), myuser.getPwd());
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
