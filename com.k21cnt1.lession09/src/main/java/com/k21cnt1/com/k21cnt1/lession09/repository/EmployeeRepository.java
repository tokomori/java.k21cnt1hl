package com.k21cnt1.com.k21cnt1.lession09.repository;

import com.k21cnt1.com.k21cnt1.lession09.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
