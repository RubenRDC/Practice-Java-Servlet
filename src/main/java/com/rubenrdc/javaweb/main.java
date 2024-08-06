package com.rubenrdc.javaweb;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/api/form")
public class main extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("<p>Hola Mundo</p>");
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usuario = request.getParameter("usuario");
        String pass = request.getParameter("password");
        
        PrintWriter writer = response.getWriter();
        writer.println("<p>Bienevenido "+ usuario +" </p>");
        writer.println("<p>Con la contraseña: "+ pass +" </p>");
        
    }
}
