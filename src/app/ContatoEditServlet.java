package app;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ContatoEdit")
public class ContatoEditServlet extends HttpServlet {

    private Agenda agenda = new Agenda();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String nome = request.getParameter("nome");
        String telefone  = request.getParameter("telefone");
        String email = request.getParameter("email");
        Contato contato = new Contato(nome, telefone , email);
        contato.setId(id);
        agenda.editContato(contato);

        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        rd.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Contato contato = agenda.getContato(id);
        contato.setId(id);
        request.setAttribute("Contato", contato);
        RequestDispatcher rd = request.getRequestDispatcher("alterar.jsp");
        rd.forward(request,response);
    }
}
