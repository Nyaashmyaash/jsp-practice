package com.nyash.jsp.repositories;

import com.nyash.jsp.fake.FakeStorage;
import com.nyash.jsp.models.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UsersRepositoryInMemoryImpl implements UsersRepository{

    public List<User> findAll() {
        return FakeStorage.storage().users();
    }
    public void save(User user) {
        FakeStorage.storage().users().add(user);
    }

    @Override
    public boolean isExist(String name, String password) {
        for (User user : FakeStorage.storage().users()) {
            if (user.getName().equals(name) &&
            user.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
}
