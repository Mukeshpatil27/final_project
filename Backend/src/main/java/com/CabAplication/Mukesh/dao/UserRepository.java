package com.CabAplication.Mukesh.dao;


import com.CabAplication.Mukesh.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin()
public interface UserRepository extends JpaRepository<User, Integer> {
}
