import jakarta.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;

public class MyFirstWeb02 extends GenericServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init() called ---- servlet initialized");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("service() called --- servlet ready to serve the request or Handling Request");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>..............Hello from LifeCycle.............</h1>");
    }

    @Override
    public void destroy() {
        System.out.println("destroy() called --- servlet is destroyed");
    }



}
