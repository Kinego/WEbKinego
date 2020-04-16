package Controlador;
import Modelo.TrabajadorDAO;
import Modelo.trabajador;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Validaciones extends HttpServlet {

    TrabajadorDAO trabDao =new TrabajadorDAO();
    trabajador traModel =new trabajador();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        }
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
    }

    @Override
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {   
        String accion=request.getParameter("accion"); 
        if (accion.equals("Acceder")) {
            String usuario=request.getParameter("txtusuario");
            String pass=request.getParameter("txtpass");
            traModel=trabDao.validar(usuario, pass);
            if (traModel.getNombre()!=null) {
                request.getRequestDispatcher("Control?accion=Principal").forward(request, response);
            }else{
            request.getRequestDispatcher("index.jsp").forward(request, response);
            }
        }else{
        request.getRequestDispatcher("index.jsp").forward(request, response);
        }

    
    }

    @Override
    public String getServletInfo() {
        return "Short description";
        
    }
}
