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
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <script src="js/cloudinary.js" type="text/javascript"></script>
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        <link href="css/animate.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
        <script src="//code.jquery.com/jquery-1.10.2.js"></script>
        <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
        <link rel="stylesheet" href="/resources/demos/style.css">
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
        
        <div class="navbar navbar-default navbar-fixed-top">
                <a class="navbar-brand" href="#">JamaPeru</a>
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>

                </div>
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li><a href="#">Cuenta </a></li>
                        <li   class="active"><a href="ListarPlatillosServlet">Mis Platillos</a></li>
                        <li><a href="Rank.jsp">Ranking</a></li>
                        <li><a href="ListaProfitServlet">Profit</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#">Cerrar sesion</a></li>
                    </ul>
                </div>
            </div>
        
        
           <div style="padding-left: 75px">
            
            <h3 align="">Ingresar nombre de platillo</h3>    <input type="text" placeholder="Nombre platillo">
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
    </body>
</html>
