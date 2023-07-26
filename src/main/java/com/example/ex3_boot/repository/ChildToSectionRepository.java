package com.example.ex3_boot.repository;

import com.example.ex3_boot.entity.Child;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChildToSectionRepository extends JpaRepository <Child, Integer>{
}
