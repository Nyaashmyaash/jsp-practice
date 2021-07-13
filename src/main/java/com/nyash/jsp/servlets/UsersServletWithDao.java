package com.nyash.jsp.servlets;

import com.nyash.jsp.dao.UserDao;
import com.nyash.jsp.dao.UserDaoJdbcImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/users")
public class UsersServletWithDao extends HttpServlet {

    private UserDao userDao;

    @Override
    public void init() throws ServletException {
        userDao = new UserDaoJdbcImpl()
    }
}
