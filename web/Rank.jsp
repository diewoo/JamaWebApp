<%-- 
    Document   : Rank
    Created on : 04-jun-2016, 14:15:42
    Author     : :b
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Rank</title>
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

    </head>
    <body>
        <div class="container"> 
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
                        <li><a href="#">Cuenta</a></li>
                        <li><a href="ListarPlatillosServlet">Mis Platillos</a></li>
                        <li class="active"><a href="Rank.jsp">Ranking</a></li>
                        <li><a href="ListaProfitServlet">Profit</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#">Cerrar sesion</a></li>
                    </ul>
                </div>
            </div>
        </nav>
            <div>
                <h2>Lista chef</h2>
            </div>
            <div class="margen" style="padding-top: 100px; padding-bottom: 40%;">
                <table  class="table table-striped table-hover " style="width: 50%; display: block; margin : 0 auto;">
                    <thead>
                        <tr>

                            <th>chef 1</th>
                            <th><img src="">foto</th>
                            <th><a href="link"></a>redirigir facebook</th>

                        </tr>
                    </thead>
                    <tbody>
                        <tr>

                            <th>chef 2</th>
                            <th><img src="">foto</th>
                            <th><a href="link"></a>redirigir facebook</th>

                        </tr>
                        <tr>

                            <th>chef 3</th>
                            <th><img src="">foto</th>
                            <th><a href="link"></a>redirigir facebook</th>

                        </tr>
                        <tr>

                            <th>chef 4</th>
                            <th><img src="">foto</th>
                            <th><a href="link"></a>redirigir facebook</th>

                        </tr>
                    </tbody>
                </table>
            </div>        
        </div>
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
