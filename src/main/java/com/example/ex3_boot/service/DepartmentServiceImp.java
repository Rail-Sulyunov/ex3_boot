package com.example.ex3_boot.service;

import com.example.ex3_boot.entity.Department;
import com.example.ex3_boot.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImp {
    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> getAllDepartment() {
        return departmentRepository.findAll();
    }


    public void saveDepartment(Department department) {
        departmentRepository.save(department);
    }


    public Department getDepartment(int id) {
        Department department = null;
        Optional<Department> optional = departmentRepository.findById(id);
        if (optional.isPresent()) {
            department = optional.get();
        }

        return department;
    }


    public void deleteDepartment(int id) {
        departmentRepository.deleteById(id);

    }
}
