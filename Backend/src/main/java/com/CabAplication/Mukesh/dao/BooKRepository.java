package com.CabAplication.Mukesh.dao;

import com.CabAplication.Mukesh.Entity.Book_req;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin()
public interface BooKRepository extends JpaRepository<Book_req , Integer> {
}
