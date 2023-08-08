package com.example.ex3_boot.repository;

import com.example.ex3_boot.entity.Department;
import com.example.ex3_boot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {

}
