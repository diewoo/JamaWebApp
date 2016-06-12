<%-- 
    Document   : AgregarPlatillo
    Created on : 04-jun-2016, 15:39:16
    Author     : j
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Platillo</title>
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
        <script type="text/javascript">
            document.getElementById("upload_widget_opener").addEventListener("click", function () {
                cloudinary.openUploadWidget({cloud_name: 'jamacomida', upload_preset: 'jrve2f6q'},
                function (error, result) {
                    console.log(error, result);
                    console.log(result[0].secure_url);
                });

            }, false);
        </script>
    </head>
    <body>
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
                        <li  class="active"><a href="ListarPlatillosServlet">Mis Platillos</a></li>
                        <li><a href="Rank.jsp">Ranking</a></li>
                        <li><a href="ListaProfitServlet">Profit</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#">Cerrar sesion</a></li>
                    </ul>
                </div>
            </div>
        </nav>

        <div style="padding-left: 75px; padding-top: 150px">

            <h3 align="">Ingresar nombre de platillo</h3>    <input style="width: 50%" class="form-control" type="text" placeholder="Nombre platillo" required="" data-validation-required-message="Ingresar Nombre de platillo">
            <h3 align="">Ingresar Foto: </h3> <a href="#" id="upload_widget_opener">Subir foto</a>
            <h3 align="">Ingredientes: </h3>   
            <div style="padding-left: 50px; padding-right: 50px">
                <textarea class="form-control" type="text" rows="3" cols="40" placeholder="Ingredientes" required></textarea>
            </div>
            <h3 align="">Preparacion: </h3>
            <div style="padding-left: 50px; padding-right: 50px">
                <textarea class="form-control" type="text" rows="3" cols="40" placeholder="Detalles" required></textarea>
            </div>
            <h3 align="">Comentarios del Chef: </h3>
            <div style="padding-left: 50px; padding-right: 50px">
                <textarea class="form-control" type="text" rows="3" cols="40" placeholder="Comentarios" required></textarea>
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
