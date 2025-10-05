/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.arquitectura.servlet;

import co.edu.unipiloto.arquitectura.calculadora.CalcBeanLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ACER
 */
public class CalcServlet extends HttpServlet {

    @EJB
    private CalcBeanLocal calcBean;

    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int val1=Integer.parseInt(request.getParameter("val1"));
        int val2=Integer.parseInt(request.getParameter("val2"));
        String operation = request.getParameter("operation");
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servicio calculadora llamado CalcServlet</title>");            
            out.println("</head>");
            out.println("<body>");
             if (operation != null) {
            switch (operation) {
                case "add":
                    out.println("<p>La suma es: " + calcBean.addition(val1, val2) + "</p>");
                    break;
                case "sub":
                    out.println("<p>La resta es: " + calcBean.substraction(val1, val2) + "</p>");
                    break;
                case "mul":
                    out.println("<p>La multiplicación es: " + calcBean.multiplication(val1, val2) + "</p>");
                    break;
                case "div":
                    if (val2 != 0) {
                        out.println("<p>La división es: " + calcBean.division(val1, val2) + "</p>");
                    } else {
                        out.println("<p style='color:red'>No se puede dividir por cero</p>");
                    }
                    break;
                case "square":
                    out.println("<p>El cuadrado de " + val1 + " es: " + calcBean.square(val1) + ", el cuadrado de " + val2 + "es: " + calcBean.square(val2) + "</p>");
                    break;
                case "mod":
                    if (val2 != 0) {
                        out.println("<p>El módulo (residuo) es: " + calcBean.modulo(val1, val2) + "</p>");
                    } else {
                        out.println("<p style='color:red'>No se puede hacer módulo con divisor cero</p>");
                    }
                    break;
                default:
                    out.println("<p>Operación no válida</p>");
            }
        } else {
            out.println("<p>No se seleccionó ninguna operación</p>");
        }
            out.println("<h1>Servlet CalcServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
