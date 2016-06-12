package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AgregarPlatillo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("       <title>Agregar Platillo</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/cloudinary.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js\"></script>\n");
      out.write("        <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\n");
      out.write("        <link href=\"css/animate.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css\">\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.10.2.js\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/ui/1.11.4/jquery-ui.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            document.getElementById(\"upload_widget_opener\").addEventListener(\"click\", function () {\n");
      out.write("                cloudinary.openUploadWidget({cloud_name: 'jamacomida', upload_preset: 'jrve2f6q'},\n");
      out.write("                        function (error, result) {\n");
      out.write("                            console.log(error, result);\n");
      out.write("                            console.log(result[0].secure_url);\n");
      out.write("                        });\n");
      out.write("\n");
      out.write("            }, false);\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">JamaPeru</a>\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li><a href=\"#\">Cuenta </a></li>\n");
      out.write("                        <li   class=\"active\"><a href=\"ListarPlatillosServlet\">Mis Platillos</a></li>\n");
      out.write("                        <li><a href=\"Rank.jsp\">Ranking</a></li>\n");
      out.write("                        <li><a href=\"ListaProfitServlet\">Profit</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li><a href=\"#\">Cerrar sesion</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("           <div style=\"padding-left: 75px\">\n");
      out.write("            \n");
      out.write("            <h3 align=\"\">Ingresar nombre de platillo</h3>    <input type=\"text\" placeholder=\"Nombre platillo\">\n");
      out.write("            <h3 align=\"\">Ingresar Foto: </h3> <a href=\"#\" id=\"upload_widget_opener\">Subir foto</a>\n");
      out.write("            <h3 align=\"\">Ingredientes: </h3>   \n");
      out.write("            <div style=\"padding-left: 50px; padding-right: 50px\">\n");
      out.write("            <textarea class=\"form-control\" type=\"text\" rows=\"3\" cols=\"40\" placeholder=\"Ingredientes\" required></textarea>\n");
      out.write("            </div>\n");
      out.write("            <h3 align=\"\">Preparacion: </h3>\n");
      out.write("            <div style=\"padding-left: 50px; padding-right: 50px\">\n");
      out.write("            <textarea class=\"form-control\" type=\"text\" rows=\"3\" cols=\"40\" placeholder=\"Detalles\" required></textarea>\n");
      out.write("            </div>\n");
      out.write("            <h3 align=\"\">Comentarios del Chef: </h3>\n");
      out.write("            <div style=\"padding-left: 50px; padding-right: 50px\">\n");
      out.write("            <textarea class=\"form-control\" type=\"text\" rows=\"3\" cols=\"40\" placeholder=\"Comentarios\" required></textarea>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
