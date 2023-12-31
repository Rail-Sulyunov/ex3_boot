package com.example.ex3_boot.controller;


import com.example.ex3_boot.entity.Department;
import com.example.ex3_boot.entity.Employee;
import com.example.ex3_boot.service.DepartmentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DepartmentController {
    @Autowired
    private DepartmentServiceImp departmentServiceImp;

    @GetMapping("/department")
    public List<Department> showAllDepartment() {
        List<Department> allDepartments = departmentServiceImp.getAllDepartment();
        return allDepartments;
    }

    @GetMapping("/departments/{id}")
    public Department getDepartment(@PathVariable int id) {
        Department department = departmentServiceImp.getDepartment(id);
        return department;
    }

    @PostMapping("/departments")
    public Department addNewDepartment(@RequestBody Department department) {
        departmentServiceImp.saveDepartment(department);
        return department;
    }

    @PutMapping("/departments")
    public Department updateDepartment(@RequestBody Department department) {
        departmentServiceImp.saveDepartment(department);
        return department;
    }
    @DeleteMapping("/departments/{id}")
    public String deleteDepartment(@PathVariable int id) {
        departmentServiceImp.deleteDepartment(id);
        return "Department with ID = " + id + " was deleted.";
    }
}