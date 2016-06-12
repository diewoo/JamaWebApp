package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html >\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <title>Jama!</title>\n");
      out.write("        <!-- CSS PERSONALIZADO -->\n");
      out.write("        <link href=\"css2/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css2/freelancer.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!-- fuentes -->\n");
      out.write("        <link href=\"http://fonts.googleapis.com/css?family=Montserrat:400,700\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"http://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <script src=\"js2/classie.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js2/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js2/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js2/cbpAnimatedHeader.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js2/freelancer.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js2/jqBootstrapValidation.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js2/contact_me.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"navbar-header page-scroll\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#page-top\">JamaApp</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li ><a href=\"#\">Acerca de nosotros</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li><a href=\"#\">Registrarse</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <header>\n");
      out.write("\n");
      out.write("            <div style=\"padding-top: 200px\">\n");
      out.write("                <h2>Jama Login!!!</h2>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <form method=\"POST\" action=\"LoginServlet\">\n");
      out.write("                <div class=\"login\" style=\"padding-bottom: 15%\">\n");
      out.write("                    <input style=\"width: 50%; display: block; margin : 0 auto;\" class=\"form-control\" type=\"text\" placeholder=\"usuario\" name=\"user\"><br>\n");
      out.write("                    <input style=\"width: 50%; display: block; margin : 0 auto;\" class=\"form-control\" type=\"password\" placeholder=\"password\" name=\"password\"><br>\n");
      out.write("                    <div class=\"\" ><input class=\"btn btn-lg btn-outline\" type=\"submit\" value=\"Login\" ></div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("        <footer class=\"text-center\">\n");
      out.write("        <div class=\"footer-above\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"footer-col col-md-4\">\n");
      out.write("                        <h3>Sede principal</h3>\n");
      out.write("                        <p>3481 Los Laureles<br>San Isidro, Lima</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"footer-col col-md-4\">\n");
      out.write("                        <h3>Nuestras redes Sociales</h3>\n");
      out.write("                        <ul class=\"list-inline\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\" class=\"btn-social btn-outline\"><i class=\"fa fa-fw fa-facebook\"></i></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\" class=\"btn-social btn-outline\"><i class=\"fa fa-fw fa-google-plus\"></i></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\" class=\"btn-social btn-outline\"><i class=\"fa fa-fw fa-twitter\"></i></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\" class=\"btn-social btn-outline\"><i class=\"fa fa-fw fa-linkedin\"></i></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\" class=\"btn-social btn-outline\"><i class=\"fa fa-fw fa-dribbble\"></i></a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"footer-col col-md-4\">\n");
      out.write("                        <h3>Acerca de nuestra política</h3>\n");
      out.write("                        <p>Todas las recetas están a libre dispocisión de los usuarios finales.<a href=\"http://startbootstrap.com\">Start Bootstrap</a>.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer-below\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        Copyright © Jama APP 2016\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("        <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>\n");
      out.write("        <script src=\"http://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js\"></script>\n");
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
