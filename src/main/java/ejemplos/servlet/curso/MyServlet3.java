package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet3")
public class MyServlet3 extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // send HTML page to client
        out.println("<html>");
        out.println("<head><title>Ejemplo HTML desde Servlet</title></head>");
        out.println("<body>");
        out.println("<h2>HTML Forms</h2>");
        out.println("<form action=\"/myServlet2\">\n");
        out.println("<label for=\"fname\">Nombres:</label><br>\n");
        out.println("<input type=\"text\" id=\"fname\" name=\"fname\" placeholder=\"John\"><br>\n");
        out.println("<label for=\"lname\">Apellido:</label><br>\n");
        out.println("<input type=\"text\" id=\"lname\" name=\"lname\" placeholder=\"Doe\"><br>\n");
        out.println("<label for=\"age\">Edad:</label><br>\n");
        out.println("<input type=\"number\" id=\"age\" name=\"age\" min=\"0\" max=\"100\" placeholder=\"28\"><br><br>\n");
        out.println("<input type=\"submit\" value=\"Submit\">\n");
        out.println("</form> ");
    }

}