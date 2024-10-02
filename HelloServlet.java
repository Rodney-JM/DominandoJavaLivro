import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class HelloServlet extends HttpServlet{
    private String greetingText;

    public void init(){
        //textoSaudação está configurado como init-param no web.xml
        greetingText = getInitParameter("Texto saudação");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        PrintWriter out = response.getWriter();

        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>HelloServlet</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY BGCOLOR=\"white\">");
        out.println("<B>"+ greetingText + "</B>");
        out.println("</BODY>");
        out.println("</HTML>");
    }

    public void destroy(){
        greetingText = null;
    }
}