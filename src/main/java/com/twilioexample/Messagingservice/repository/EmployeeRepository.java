package com.twilioexample.Messagingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.twilioexample.Messagingservice.model.Employee;
/*
 * This is for curd operations so we are extending JpaRepository
 */

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	

}

