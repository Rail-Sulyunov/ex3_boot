package com.example.ex3_boot.service;

import com.example.ex3_boot.entity.Child;
import com.example.ex3_boot.repository.ChildToSectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChildToSectionServiceImp {
    @Autowired
    private ChildToSectionRepository childToSectionRepository;

    public List<Child> getAllChild() {
        return childToSectionRepository.findAll();
    }


    public void saveChild(Child child) {
        childToSectionRepository.save(child);
    }


    public Child getChild(int id) {
        Child child = null;
        Optional<Child> optional = childToSectionRepository.findById(id);
        if (optional.isPresent()) {
            child = optional.get();
        }

        return child;
    }


    public void deleteChild(int id) {
        childToSectionRepository.deleteById(id);

    }
}
