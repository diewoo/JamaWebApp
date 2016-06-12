package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.sw2.bean.Platillo;
import java.util.ArrayList;
import java.util.List;

public final class ListarPlatillo_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Bootstrap Example</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js\"></script>\n");
      out.write("        <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\n");
      out.write("        <link href=\"css/animate.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css\">\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.10.2.js\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/ui/1.11.4/jquery-ui.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("            ul.nav-pills {\n");
      out.write("                top: 20px;\n");
      out.write("                position: fixed;\n");
      out.write("            }\n");
      out.write("            div.col-sm-9 div {\n");
      out.write("                height: 250px;\n");
      out.write("                font-size: 28px;\n");
      out.write("            }\n");
      out.write("            .section {color: #fff; background-color: #1E88E5;}\n");
      out.write("            @media screen and (max-width: 810px) {\n");
      out.write("                #section1, #section2, #section3, #section41, #section42  {\n");
      out.write("                    margin-left: 150px;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        ");

            int cont = 1;
            List<Platillo> platillos = (List<Platillo>) request.getAttribute("platillos");
        
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body data-spy=\"scroll\" data-target=\"#myScrollspy\" data-offset=\"20\">\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">JamaPeru</a>\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li ><a href=\"#\">Cuenta</a></li>\n");
      out.write("                        <li class=\"active\"><a href=\"ListarPlatillosServlet\">Mis Platillos</a></li>\n");
      out.write("                        <li><a href=\"Rank.jsp\">Ranking</a></li>\n");
      out.write("                        <li><a href=\"ListaProfitServlet\">Profit</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li><a href=\"#\">Cerrar sesion</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <nav class=\"col-sm-3\" id=\"myScrollspy\">\n");
      out.write("                    <ul class=\"nav nav-pills nav-stacked\">\n");
      out.write("\n");
      out.write("                        ");

                            for (int i = 1; i <= platillos.size(); i++) {
                        
      out.write("\n");
      out.write("                        <li><a ");
 if (i == 1) {
      out.write("class=\"active\"");
 }
      out.write(" href=\"#section");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(platillos.get(i-1).getNombre());
      out.write("</a></li>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                    \n");
      out.write("                        <li><a href=\"AgregarPlatillo.jsp\"> Agregar Platillo</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("                <div class=\"col-sm-9\">\n");
      out.write("\n");
      out.write("                    ");

                        for (Platillo plats : platillos) {
                    
      out.write("\n");
      out.write("                    <div id=\"section");
      out.print(cont);
      out.write("\" class=\"section\">    \n");
      out.write("                        <h1>");
      out.print(plats.getNombre());
      out.write("</h1>\n");
      out.write("                        <p>");
      out.print(plats.getDescripcion());
      out.write("</p>\n");
      out.write("                    </div>\n");
      out.write("                    ");

                            cont++;
                        }
                    
      out.write("\n");
      out.write("                    <div>         \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
