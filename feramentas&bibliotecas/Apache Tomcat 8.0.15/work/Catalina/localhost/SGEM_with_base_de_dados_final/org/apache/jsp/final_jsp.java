/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.15
 * Generated at: 2016-11-25 08:39:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import classes_controladoras.ClienteJpaController;
import java.util.List;
import classes.Cliente;
import javax.persistence.EntityManagerFactory;

public final class final_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

List<Cliente> clientes;
  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("     <style>\n");
      out.write("        table{\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            width:100%\n");
      out.write("        }  \n");
      out.write("        th,td{\n");
      out.write("            text-align: left;\n");
      out.write("            padding: 8px\n");
      out.write("        }\n");
      out.write("        tr:nth-child(even){\n");
      out.write("            background-color:#f2f2f2;\n");
      out.write("        }\n");
      out.write("        tr:hover{\n");
      out.write("            background-color:#5F9EAD;\n");
      out.write("        }\n");
      out.write("        th{\n");
      out.write("            background-color:#006680;\n");
      out.write("            color:white;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("     \n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>AJAX calls using Jquery in Servlet</title>\n");
      out.write("         \n");
      out.write("        \n");
      out.write("       \n");
      out.write("<script src=\"imagem/jquery-3.1.1.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"imagem/jquery-3.1.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        \n");
      out.write("<script src=\"funcoes.js\" type=\"text/javascript\"></script>\n");
      out.write("           \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("   \n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("     ");
      out.write("\n");
      out.write("    ");

        EntityManagerFactory emf = (EntityManagerFactory) getServletContext().getAttribute("emf");
        ClienteJpaController ec = new ClienteJpaController(emf);
        clientes = ec.findClienteEntities();
        
    
        int contador=clientes.size();
    
      out.write("\n");
      out.write("    \n");
      out.write("    <input type=\"text\" id=\"contador\" value=");
      out.print( contador );
      out.write("   />\n");
      out.write("\n");
      out.write("    <input type=\"hidden\" id=\"user\" name='user' value=\"0\"/>\n");
      out.write("   \n");
      out.write(" \n");
      out.write("    \n");
      out.write("     <input type=\"button\" class=\"submit\" name=\"user\" value=\"proxima\" />\n");
      out.write("     \n");
      out.write(" <input type=\"button\" class=\"voltar\" name=\"user\" value=\"anterior\" />\n");
      out.write(" \n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write(" \n");
      out.write(" <div class=\"resultado\">\n");
      out.write("        <h4>Lista de Clientes</h4>\n");
      out.write("        <a href=\"criaCliente.jsp\">Novo Cliente </a></br>\n");
      out.write("        <input type=\"text\" id=\"pesquisa\" name=\"Pesquisar\" onkeyup=\"find()\">\n");
      out.write("\n");
      out.write("       <div id=\"welcometext\">\n");
      out.write("                            \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
