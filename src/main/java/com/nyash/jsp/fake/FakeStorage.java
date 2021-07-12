//package com.nyash.jsp.fake;
//
//import com.nyash.jsp.models.User;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//
//public class FakeStorage {
//    private static final FakeStorage storage;
//
//    static {
//        storage = new FakeStorage();
//    }
//
//    private List<User> users;
//
//    private FakeStorage () {
//        this.users = new ArrayList<>();
//        User user = new User("Alex", "qwerty", LocalDate.parse("1988-04-16"));
//        User user1 = new User("Mike", "12345", LocalDate.parse("1988-06-12"));
//        User user2 = new User("Tom", "qwerty123", LocalDate.parse("1999-05-11"));
//
//        users.add(user);
//        users.add(user1);
//        users.add(user2);
//    }
//
//    public static FakeStorage storage () {
//        return storage;
//    }
//
//    public List<User> users() {
//        return users;
//    }
//}
