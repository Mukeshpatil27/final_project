package com.CabAplication.Mukesh.dao;

import com.CabAplication.Mukesh.Entity.Admin;
import org.hibernate.metamodel.internal.AbstractDynamicMapInstantiator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin , Integer> {
}
