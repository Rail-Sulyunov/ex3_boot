package com.example.ex3_boot.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyControllerTest {
    private MyController myController;

    @BeforeEach
    void setUp() {
        myController = new MyController();
        myController.addNewEmployee("Rail","Sulyunov",34);
    }

    @Test
    void getEmployee() {
    }

    @Test
    void addNewEmployee() {
    }

    @Test
    void deleteEmployee() {
    }
}