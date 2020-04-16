package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class olvidoclave_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <link href=\"assets/login.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <center>\n");
      out.write("                    <div class=\"middle\">\n");
      out.write("                        <div id=\"login\" >\n");
      out.write("                            <h3 class=\"iniciarsession\">Solicitar nueva contraseña</h3>\n");
      out.write("                \n");
      out.write("                            <form action=\"principal.jsp\" method=\"get\">\n");
      out.write("                                <fieldset class=\"clearfix\">\n");
      out.write("                                    <p ><span class=\"fa fa-user\"></span><input type=\"text\"  Placeholder=\"Ingrese usuario\" required></p> <!-- JS because of IE support; better: placeholder=\"Username\" -->\n");
      out.write("                                    <p><span class=\"fa fa-envelope\"></span><input type=\"email\"  Placeholder=\"Ingrese Email\" required></p> <!-- JS because of IE support; better: placeholder=\"Password\" -->\n");
      out.write("                                    <div>\n");
      out.write("                                        <span style=\"width:48%; text-align:left;  display: inline-block;\"><a class=\"small-text\" href=\"index.jsp\">Iniciar Session</a></span>\n");
      out.write("                                        <span style=\"width:50%; text-align:right;  display: inline-block;\"><input type=\"submit\" value=\"Enviar\"></span>\n");
      out.write("                                    </div>\n");
      out.write("                                </fieldset>\n");
      out.write("                            </form>\n");
      out.write("                            <div class=\"clearfix\"></div>\n");
      out.write("                            \n");
      out.write("                        </div> <!-- end login -->\n");
      out.write("                        <div class=\"logo\">\n");
      out.write("                            <img src=\"assets/imagenes/oie_transparent.png\" alt=\"\" class=\"imagen\"/>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </center>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
