package app;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/Agenda")
public class AgendaServlet extends javax.servlet.http.HttpServlet {

    Agenda agenda = new Agenda();

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setAttribute("Agenda", this.agenda);
        RequestDispatcher rd = request.getRequestDispatcher("consulta.jsp");
        rd.forward(request,response);
    }
}
