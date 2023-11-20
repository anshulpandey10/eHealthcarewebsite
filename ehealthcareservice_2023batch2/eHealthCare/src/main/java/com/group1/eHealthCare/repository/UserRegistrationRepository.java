package com.group1.eHealthCare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.group1.eHealthCare.entity.Personal;
import com.group1.eHealthCare.entity.UserRegistration;

//import com.example.ProductExample.UserRegistration;


@Repository
public interface UserRegistrationRepository extends JpaRepository<UserRegistration,Integer> {

	@Query(value ="select * from USERREGISTRATION p where p.Name like %?1", nativeQuery =true)
	UserRegistration findByName(String name);
	
	UserRegistration findByNameNative(String name);
	
	
	@Query(value ="select * from USERREGISTRATION p where p.username = :username", nativeQuery =true)
	UserRegistration findByUsername(@Param("username") String username);
}

