package com.nyash.jsp.models;

import java.time.LocalDate;

public class User {

    private String name;

    private String password;

    private LocalDate birthDate;

    public User(String name, String password, LocalDate birthDate) {
        this.name = name;
        this.password = password;
        this.birthDate = birthDate;
    }
}
