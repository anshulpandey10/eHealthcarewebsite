package com.group1.eHealthCare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.group1.eHealthCare.entity.Rooms;

@Repository
public interface RoomsRepository extends JpaRepository<Rooms, Integer> {

	@Query(value = "select * from ROOMS_eHC p where p.NAME like %?1", nativeQuery = true)
	Rooms findByName(String name);

	Rooms findByNameNative(String name);

}
