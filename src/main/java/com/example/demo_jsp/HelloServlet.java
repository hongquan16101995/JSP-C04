package com.example.demo_jsp;

import java.io.*;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
        Animal animal = new Animal("Mực", 4);
        Animal animal1 = new Animal("Miu", 2);
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(animal);
        animals.add(animal1);
        request.setAttribute("demo", "");
        request.setAttribute("dog", animal);
        request.setAttribute("animals", animals);
        requestDispatcher.forward(request, response);
    }

    public void destroy() {
    }
}