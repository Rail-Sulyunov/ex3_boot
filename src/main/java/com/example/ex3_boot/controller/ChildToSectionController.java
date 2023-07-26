package com.example.ex3_boot.controller;

import com.example.ex3_boot.entity.Child;
import com.example.ex3_boot.service.ChildToSectionServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ChildToSectionController {
    @Autowired
    private ChildToSectionServiceImp childToSectionServiceImp;

    @GetMapping("/child")
    public List<Child> showAllChild() {
        List<Child> allChilds = childToSectionServiceImp.getAllChild();
        return allChilds;
    }

    @GetMapping("/child/{id}")
    public Child getChild(@PathVariable int id) {
        Child child = childToSectionServiceImp.getChild(id);
        return child;
    }

    @PostMapping("/childs")
    public Child addNewChild(@RequestBody Child child) {
        childToSectionServiceImp.saveChild(child);
        return child;
    }

    @PutMapping("/childs")
    public Child updateChild(@RequestBody Child child) {
        childToSectionServiceImp.saveChild(child);
        return child;
    }
    @DeleteMapping("/childs/{id}")
    public String deleteChild(@PathVariable int id) {
        childToSectionServiceImp.deleteChild(id);
        return "Child with ID = " + id + " was deleted.";
    }
}
