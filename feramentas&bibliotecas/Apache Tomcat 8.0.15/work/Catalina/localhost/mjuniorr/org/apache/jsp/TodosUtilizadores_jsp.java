/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.15
 * Generated at: 2016-10-04 12:13:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import controller.UtilizadorJpaController;
import javax.persistence.EntityManagerFactory;
import classe.Utilizador;
import java.util.List;
import java.util.List;

public final class TodosUtilizadores_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

List<Utilizador> u;
  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/cabecalho.jsp", Long.valueOf(1475582164781L));
    _jspx_dependants.put("/rodape.jsp", Long.valueOf(1475582164984L));
  }

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Todos utilizadores</title>\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"css/estilo.css\"/>\n");
      out.write("   </head>\n");
      out.write("    \n");
      out.write("\n");
      out.write("         ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>cabecalho</title>\n");
      out.write("           <link type=\"text/css\" rel=\"stylesheet\" href=\"css/estilo.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("     <header>   \n");
      out.write("         <a href=\"principal.jsp?acao=1\"> \n");
      out.write("             <img id=\"logo\" src=\"imagem/transferir.png\"></a>\n");
      out.write("            Sistema de Gestão de Empréstimos Monetários\n");
      out.write("          </header>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("      <form action=\"principal.jsp\">\n");
      out.write("        <button id=\"sair\" > <img src=\"imagem/Users-Remove-User-icon.png\" width=\"15px\" height=\"15px\"> Sair </button>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("          <form action=\"criarUtilizador.jsp\">\n");
      out.write("             <button id=\"adicionarCliente\"> <img src=\"imagem/adduser_añadir_3553.png\" width=\"15px\" height=\"15px\"> Novo Cliente </button>\n");
      out.write("         </form>\n");
      out.write("           \n");
      out.write("       \n");
      out.write("       \n");
      out.write("                  \n");
      out.write("     \n");
      out.write("         ");
      out.write("\n");
      out.write("        ");

           EntityManagerFactory emf =(EntityManagerFactory) getServletContext().getAttribute("emf"); 
           UtilizadorJpaController ec = new UtilizadorJpaController(emf);
           u= ec.findUtilizadorEntities();
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("         \n");
      out.write("        \n");
      out.write("         ");

                   
             for(int i = 0; i<u.size(); i++){
                          
                        if( u.get(i).getIdpermissao().getIdpermissao() == 2){
                         
                           
                    
         
      out.write("\n");
      out.write("         <br>\n");
      out.write("         <br>\n");
      out.write("         <br>\n");
      out.write("         <p><img  src=\"imagem/user.png\" width=\"20px\" height=\"20px\"><u> ");
      out.print(u.get(i).getNomeUtilizador() );
      out.write(" </u></p>\n");
      out.write("          <a href=\"criarUtilizador.jsp\">  <p ><img  src=\"imagem/edit-user-xxl.png\" width=\"20px\" height=\"20px\"> Editar </a>&boxv; \n");
      out.write("             <a href=\"principalFuncionario.jsp\"> <img src=\"imagem/Users-Remove-User-icon.png\" width=\"20px\" height=\"20px\">Remover</a> \n");
      out.write("             &boxv; <a href=\"RegistarPagamento.jsp\">Registar Pagamento </a> &boxv; <a href=\"RegistarPagamento.jsp\">Registar Emprestimo</a></p>\n");
      out.write("     \n");
      out.write("         ");
 } 
      out.write("\n");
      out.write("       \n");
      out.write("             \n");
      out.write("       \n");
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("             \n");
      out.write("            \n");
      out.write("              \n");

    
    }


      out.write("\n");
      out.write("          \n");
      out.write("\n");
      out.write("             </div>\n");
      out.write("        \n");
      out.write("         \n");
      out.write("        \n");
      out.write("          \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("           <table id=\"links\">\n");
      out.write("            <tr>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("                \n");
      out.write("          \n");
      out.write("                    \n");
      out.write("            \n");
      out.write("         ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>rodape</title>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/estilo.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         \n");
      out.write("        <footer>\n");
      out.write("            \n");
      out.write("           \n");
      out.write("            \n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write(" \n");
      out.write("     \n");
      out.write("    \n");
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
