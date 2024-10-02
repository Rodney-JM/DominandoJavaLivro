import javax.servlet.*;
import java.io.*;

public class SimpleServlet extends javax.servlet.GenericServlet{
    //inicializa o servlet e suas configurações
    public void init(ServletConfig config) throws ServletException{
        super.init(config);
    }

    //o método service será executado a cada requisição do usuário
    //o request traz dados que podem ter sido enviados pelo cliente
    //o response devolve dados processados
    public void service(ServletRequest request, ServletResponse response) throws IOException{
        //obtem o stream da resposta
        PrintWriter out = response.getWriter();
        //gerando resposta
        out.println("Bem vindo ao java servlets");
        //fecha Stream
        out.close();
    }
}


//test