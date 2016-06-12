<%@page import="com.sw2.bean.Platillo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Bootstrap Example</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- CSS PERSONALIZADO -->
        <link href="css2/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css2/freelancer.css" rel="stylesheet" type="text/css"/>
        <!-- fuentes -->
        <link href="http://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
        <link href="http://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css">
        <script src="js2/classie.js" type="text/javascript"></script>
        <script src="js2/jquery.js" type="text/javascript"></script>
        <script src="js2/bootstrap.min.js" type="text/javascript"></script>
        <script src="js2/cbpAnimatedHeader.min.js" type="text/javascript"></script>
        <script src="js2/freelancer.js" type="text/javascript"></script>
        <script src="js2/jqBootstrapValidation.js" type="text/javascript"></script>
        <script src="js2/contact_me.js" type="text/javascript"></script>
        <style>
            body {
                position: relative;
            }
            ul.nav-pills {
                top: 20px;
                position: fixed;
            }
            div.col-sm-9 div {
                height: 250px;
                font-size: 28px;
            }
            .section {color: #fff; background-color: #1E88E5;}
            @media screen and (max-width: 810px) {
                #section1, #section2, #section3, #section41, #section42  {
                    margin-left: 150px;
                }
            }
        </style>
        <%
            int cont = 1;
            List<Platillo> platillos = (List<Platillo>) request.getAttribute("platillos");
        %>
    </head>
    <body data-spy="scroll" data-target="#myScrollspy" data-offset="20" class="index">

        <nav class="navbar navbar-default navbar-fixed-top">
            <div class="container">
                <div class="navbar-header page-scroll">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#page-top">JamaApp</a>
                </div>
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li ><a href="#">Cuenta</a></li>
                        <li class="active"><a href="ListarPlatillosServlet">Mis Platillos</a></li>
                        <li><a href="Rank.jsp">Ranking</a></li>
                        <li><a href="ListaProfitServlet">Profit</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#">Cerrar sesion</a></li>
                    </ul>
                </div>
            </div>
        </nav>     

        <header>
            <div class="container" style="padding-top: 100px; padding-bottom: 20%">

                <nav class="col-sm-3" id="myScrollspy" >
                    <ul class="nav nav-pills nav-stacked" style="padding-top: 100px">

                        <%
                            for (int i = 1; i <= platillos.size(); i++) {
                        %>
                        <li><a <% if (i == 1) {%>class="active"<% }%> style="color: white; background-color: #16527a" href="#section<%=i%>"><%=platillos.get(i - 1).getNombre()%></a></li>
                            <%
                                }
                            %>

                        <li><a href="AgregarPlatillo.jsp"> Agregar Platillo</a></li>
                    </ul>
                </nav>
                <div class="col-lg-6" style="width: 500px">

                    <%
                        for (Platillo plats : platillos) {
                    %>
                    <div id="section<%=cont%>" class="section" style="background-color: #16527a">    
                        <h3><%=plats.getNombre()%></h3>
                        <p><%=plats.getDescripcion()%></p>
                    </div>
                    <%
                            cont++;
                        }
                    %>
                </div>
            </div>
            <a href="AgregarPlatillo.jsp" style="display:inline-block; position: fixed; right: 10px; bottom: 300px">
                <img style="display:block;width:64px; height:64px;"  src="img/Add-128.png" />
            </a>
        </header>
        <footer class="text-center">
            <div class="footer-above">
                <div class="container">
                    <div class="row">
                        <div class="footer-col col-md-4">
                            <h3>Sede principal</h3>
                            <p>3481 Los Laureles<br>San Isidro, Lima</p>
                        </div>
                        <div class="footer-col col-md-4">
                            <h3>Nuestras redes Sociales</h3>
                            <ul class="list-inline">
                                <li>
                                    <a href="#" class="btn-social btn-outline"><i class="fa fa-fw fa-facebook"></i></a>
                                </li>
                                <li>
                                    <a href="#" class="btn-social btn-outline"><i class="fa fa-fw fa-google-plus"></i></a>
                                </li>
                                <li>
                                    <a href="#" class="btn-social btn-outline"><i class="fa fa-fw fa-twitter"></i></a>
                                </li>
                                <li>
                                    <a href="#" class="btn-social btn-outline"><i class="fa fa-fw fa-linkedin"></i></a>
                                </li>
                                <li>
                                    <a href="#" class="btn-social btn-outline"><i class="fa fa-fw fa-dribbble"></i></a>
                                </li>
                            </ul>
                        </div>
                        <div class="footer-col col-md-4">
                            <h3>Acerca de nuestra política</h3>
                            <p>Todas las recetas están a libre dispocisión de los usuarios finales.<a href="http://startbootstrap.com">Start Bootstrap</a>.</p>
                        </div>
                    </div>
                </div>
            </div>
            <div class="footer-below">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-12">
                            Copyright © Jama APP 2016
                        </div>
                    </div>
                </div>
            </div>
        </footer>       
        <script src="http://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
    </body>

</html>

