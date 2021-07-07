package com.nyash.jsp;

import com.nyash.jsp.models.User;
import com.nyash.jsp.repositories.UsersRepository;
import com.nyash.jsp.repositories.UsersRepositoryInMemoryImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/signUp")
public class SignUpServlet extends HttpServlet {

    private UsersRepository usersRepository;

    @Override
    public void init() throws ServletException {
        this.usersRepository = new UsersRepositoryInMemoryImpl();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> users = usersRepository.findAll();

    }
}
