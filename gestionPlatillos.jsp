<%-- 
    Document   : gestiontarjetas
    Created on : 03-oct-2015, 19:18:14
    Author     : Diego
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<!--<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <a href="agregartarjeta.jsp">Agregar</a>
          <ul>
            
          <%--   <c:forEach var="x" items="${sessionScope.listado}" >
                <li><a href="crud?accion=consultar&id=<c:out value="${x.id}" />">
                        <c:out   value="${x.id}" />
                        </a>  
                        ${x.id} ${x.atencion} ${x.preciomartes}  ${x.dulceria} ${x.cumpleanios} ${x.calendario} ${x.imagen} 
                <a href="crud?accion=eliminar&id=<c:out value="${x.id}" />">Eliminar</a>
                 <input type="hidden" name="id" value="${x.id}"/>
                 <a href="modificartarjeta.jsp">Modificar</a>
                 
                </li>
            </c:forEach>--%>

           </ul>
    </body>
</html>
-->
<html>
    <head>
        <title>Platillos</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        
        <header class="clase-general">
            
                <nav class="navbar navbar-default navbar-static-top" role="navigation">
                    <div class="container-fluid">
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".botoncito" >
                            <span class="sr-only">Menu</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button> 
                            <img src="img/Captura.JPG" alt=""/>
                        </div>

                        <!-- el menu del navbar   -->

                        <div class="collapse navbar-collapse navbar-right botoncito" >
                            <ul class="nav navbar-nav">
                                
                                 <li class="active"><a style="background-color: #808000" href="gestiontarjetas"><p style="color: white;">Gestionar Platillos</p></a></li> 
                                <li class="active" ><a  href="#"><p style="color: white">Agregar</p></a></li> 
                            </ul>
                        </div>

                    </div>              
                </nav>

            </header>
            
            <section class="main clase-general">
                <div class="container-fluid">
                    <ul>
                        <c:forEach var="x" items="${sessionScope.listado}" >
                            
                            <div class="row"><br>

                                <ul class="list-inline ">
                                    <li class="col-md-4 col-xs-12">
                                       <div >
                                           <p><img src="${x.imagen}" alt=""/></p>                                             
                                        </div> 
                                    </li>
                                    <li class="col-md-8 col-xs-12">
                                        
                                        <table >
                                            <thead>
                                              <tr>
                                                  <div  style="color: white;background-color: grey;padding-left: 15px">Atributos</div>
                                                 
                                              </tr>
                                            </thead>
                                            <tbody>
                                            <td style="padding-bottom: 35px">
                                                  <br>
                                                  <br>
                                                  <div >
                                                  <p style="color: #808000">Nombre</p>
                                                <p style="color: #808000">Descripcion</p>
                                                 
                                                <p style="color: #808000">Tag</p> 
                                                  </div>
                                              </td>
                                              
                                              <td style="padding-left: 30px;margin-bottom: 20px;margin-top: 30px;">
                                                  
                                                  <br>
                                                  <br>
                                                  <br>
                                                 <p >${x.nombre}</p> 
                                                <p >${x.descripcion}</p>
                                                <p >${x.tag}</p>
                                                <p style="color: red"> <a  style="color: red"href="crud?accion=eliminar&id=<c:out value="${x.id}" />">Eliminar</a></p>
                                                
                                                <p> <a  style="color: orange" href="modificartarjeta?id=<c:out value="${x.id}" />">Postear en facebook</a></p>
                                               
                                               
                                                
                                              </td>
                                              
                                            </tbody>
                                          </table>
                                        
                                    </li>                                    
                                </ul>

                            </div><!--  class row  -->
                                
                                 
                               
                        </c:forEach>              
                    </ul><!-- fin del ul   -->
                </div> 
            </section>
            
        <footer class="clase-general">
           <div  class='triangulitos '>
                <span style='visibility: hidden'>asd</span> 
            </div>       
            <div class="foot  col-xs-12">
                <div class="container">
                    <div class="row">

                        <ul class="list-inline ulf">
                            <li class="col-md-2 col-xs-12">
                               <div >
                                   <img src="img/logo-ULima.png" alt=""/>
                                </div> 
                            </li>
                            <li class="col-md-7 col-xs-12">
                               <div >
                                    <h5 id="idh6">
                                        
                                    </h5>                                             
                                </div>  
                            </li>
                            <li class="col-md-3 col-xs-12">
                                <div >
                                    <h5 id="idh6-2">
                                        Integrantes de grupo:<br><br>
                                        
                                    </h5>                                            
                                </div>
                            </li>
                        </ul>

                    </div>
                </div>
            </div>
         
        </footer>
         
        
        <script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>        
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
    </body>
</html>

