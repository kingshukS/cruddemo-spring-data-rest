package com.kingshuk.springboot.cruddemo.repo;

import com.kingshuk.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}