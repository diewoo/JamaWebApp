package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Registro JamaPeru</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\" integrity=\"sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"css/animate.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css\">\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.10.2.js\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/ui/1.11.4/jquery-ui.js\"></script>\n");
      out.write("        <link href=\"css/sweetalert.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/sweetalert.min.js\" type=\"text/javascript\"></script>\n");
      out.write("       <script src=\"js/validalogin.js\" type=\"text/javascript\"></script> \n");
      out.write("       \n");
      out.write("        <script>\n");
      out.write("            $(function () {\n");
      out.write("                $(\"#datepicker\").datepicker();\n");
      out.write("            });\n");
      out.write("        </script> \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">JamaPeru</a>\n");
      out.write("\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">Brand</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li class=\"active\"><a href=\"#\">Link <span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("                        <li><a href=\"#\">Link</a></li>\n");
      out.write("\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li><a href=\"#\">Cerrar sesion</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("\n");
      out.write("                <div STYLE=\"margin-top:10%\">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-primary\" >Registrarse por Facebook</button>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <hr class=\"star-light\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <form class=\"form-horizontal\" id=\"form\" method=\"post\" >\n");
      out.write("                <fieldset>\n");
      out.write("                    <legend>Registrate con tu direccion de email</legend>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"inputNombreUsuario\" class=\"col-lg-2 control-label \">Nombre de Usuario:</label>\n");
      out.write("                        <div class=\"col-lg-10 \">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"usuario\" >\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div style=\"margin-top: auto\"class=\"form-group\">\n");
      out.write("                        <label for=\"inputNombreApellido\" class=\"col-lg-2 control-label\">Nombre y Apellido:</label>\n");
      out.write("                        <div class=\"col-lg-10 \">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"inputNombreApellido\" >\n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("                    <div  style=\"margin-top: auto\"class=\"form-group\">\n");
      out.write("                        <label for=\"inputEmail\" class=\"col-lg-2 control-label\">Email:</label>\n");
      out.write("                        <div class=\"col-lg-10 \">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"inputEmail\" >\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"inputConfirmarEmail\" class=\"col-lg-2 control-label\">Confirmar Email:</label>\n");
      out.write("                        <div class=\"col-lg-10 \">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"inputConfirmarEmail\" >\n");
      out.write("                        </div>\n");
      out.write("                    </div>  \n");
      out.write("                    <div  style=\"margin-top: auto\"class=\"form-group\">\n");
      out.write("                        <label  class=\"col-lg-2 control-label\">Fecha de Nacimiento:</label>   \n");
      out.write("                        <div class=\"col-lg-10 \">\n");
      out.write("                            <input class=\"form-control\" type=\"text\" id=\"datepicker\">\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div style=\"margin-top: auto\"class=\"form-group\">\n");
      out.write("                    <div  class=\"col-xs-10\">\n");
      out.write("                        <input style=\"border-radius: 15px 15px 15px 15px ;\"  type=\"submit\" class=\"btn btn btn-primary btn-block\" id=\"ingresar\"  value='Registrarse'/>\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("                </fieldset>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("    \n");
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
