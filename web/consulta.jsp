<%@ page import="app.Contato" %>
<%@ page import="app.Agenda" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: Administrador
  Date: 12/05/2020
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Agenda</title>
    </head>
    <body>
        <h1>
            Agenda
        </h1>
        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nome</th>
                    <th>Telefone</th>
                    <th>E-mail</th>
                </tr>
            </thead>
            <tbody>
        <%
            Agenda agenda = (Agenda) request.getAttribute("Agenda");
            for (Contato contato : agenda.getAgenda()){
        %>
                <tr>
                    <td><a href="ContatoEdit?id=<%= contato.getId() %>">Editar</a></td>
                    <td><%= contato.getNome() %></td>
                    <td><%= contato.getTelefone() %></td>
                    <td><%= contato.getEmail() %></td>
                </tr>
        <%
            }
        %>
            </tbody>
        </table>
        <b/>
        <p><a href="/">Voltar</a></p>
    </body>
</html>
