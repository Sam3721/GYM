/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package RutinaCliente;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Cliente;
import logica.Rutina;
import logica.RutinaFuerza;
import logica.RutinaMasa;
import logica.RutinaPeso;
/**
 *
 * @author yerky vargas
 */
@WebServlet(name = "RutinaCliente", urlPatterns = {"/RutinaCliente"})
public class RutinaCliente extends HttpServlet {
    
    public static Rutina rut;
    public static void liskov(Rutina r, List<String> rutina) {
        r.crearRutina(); 
        r.mostrarRutina(rutina);
       rut=r;
    }
    private List<String> rutina;
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
        
        Cliente cliente=new Cliente();
        response.setContentType("text/html;charset=UTF-8");
        
        if ("1".equals(request.getParameter("objetivo"))) {
            
                RutinaMasa rutinaMasa= new RutinaMasa();
                liskov(rutinaMasa, rutina);
                
            }else if("2".equals(request.getParameter("objetivo"))) {
                
                RutinaPeso rutinaPeso= new RutinaPeso();
                liskov(rutinaPeso, rutina);
            }else if("3".equals(request.getParameter("objetivo"))) {
                
                RutinaFuerza rutinaFuerza= new RutinaFuerza();
                liskov(rutinaFuerza, rutina);
            }
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RutinaCliente</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Esta es la rutina que se estableció para ti: " +  "</h1>");
            out.println("<h1>Nombre: " +  cliente.getNombre()+ "</h1>");
            out.println("<h1>Peso: " +  cliente.getPeso()+ "</h1>");
            out.println("<h1>Altura: " +  cliente.getAltura()+ "</h1>");
            out.println("<h1>Edad: " +  cliente.getEdad()+ "</h1>");
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
