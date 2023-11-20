package com.group1.eHealthCare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.group1.eHealthCare.entity.Test;

@Repository
public interface TestRepository extends JpaRepository<Test, Integer> {

	@Query(value = "select * from Test_eHC p where p.NAME like %?1", nativeQuery = true)
	Test findByName(String name);

	Test findByNameNative(String name);

}
