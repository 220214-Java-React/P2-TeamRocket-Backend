package com.revature.myuser.repository;

import com.revature.myuser.model.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Two main interfaces to explore are JpaRepository, CrudRepository

@Repository
public interface MyUserRepository extends JpaRepository<MyUser, Integer> { }
