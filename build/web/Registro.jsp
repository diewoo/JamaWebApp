<%-- 
    Document   : Registro
    Created on : 4/06/2016, 10:37:24 AM
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro JamaPeru</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
        <link href="css/animate.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
        <script src="//code.jquery.com/jquery-1.10.2.js"></script>
        <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
        <link href="css/sweetalert.css" rel="stylesheet" type="text/css"/>
        <script src="js/sweetalert.min.js" type="text/javascript"></script>
        
        <script>
            $(function () {
                $("#datepicker").datepicker();
            });
        </script> 
    </head>
    <body>


        <div class="container">
            <div class="navbar navbar-default navbar-fixed-top">
                <a class="navbar-brand" href="#">JamaPeru</a>

                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">Brand</a>
                </div>

                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="#">Link <span class="sr-only">(current)</span></a></li>
                        <li><a href="#">Link</a></li>

                        </li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#">Cerrar sesion</a></li>
                    </ul>
                </div>

            </div>

            <div class="form-group">

                <div STYLE="margin-top:13%">
                    <button  type="button"  class=" btn-primary "  style="border-radius: 15px 15px 15px 15px " >Registrarse por Facebook</button>
                </div>

            </div>

            <hr class="star-light">


            <form class="form-horizontal" id="form" method="post" >
                <fieldset>
                    <legend ><p style="text-justify: auto;text-align: center;">Registrate con tu dirección de email</p></legend>
                    <div class="form-group">
                        <label for="inputNombreUsuario" class="col-lg-2 control-label ">Nombre de Usuario:</label>
                        <div  style="margin-top: auto "class="col-lg-10 ">
                            <input type="text" class="form-control" id="usuario" >
                        </div>
                    </div>

                    <div style="margin-top: auto"class="form-group">
                        <label for="inputNombreApellido" class="col-lg-2 control-label">Nombre y Apellido:</label>
                        <div class="col-lg-10 ">
                            <input type="text" class="form-control" id="nombreapellido" >
                        </div>
                    </div> 
                    <div  style="margin-top: auto"class="form-group">
                        <label for="inputEmail" class="col-lg-2 control-label">Email:</label>
                        <div class="col-lg-10 ">
                            <input type="text" class="form-control" id="inputEmail" >
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputConfirmarEmail" class="col-lg-2 control-label">Confirmar Email:</label>
                        <div class="col-lg-10 ">
                            <input type="text" class="form-control" id="inputConfirmarEmail" >
                        </div>
                    </div>  
                    <div  style="margin-top: auto"class="form-group">
                        <label  class="col-lg-2 control-label">Fecha de Nacimiento:</label>   
                        <div class="col-lg-10 ">
                            <input class="form-control" type="text" id="datepicker">
                            
                        </div>
                    </div
                    <div style="margin-top: auto"class="form-group">
                        <div  class="col-xs-10">
                            <input style="border-radius: 15px 15px 15px 15px ;color: #330033;background-color:#A5DC86 "  type="submit" class="btn btn btn-primary btn-block" id="ingresar"  value='Registrarse'/>
                    </div>
                    </div>
                </fieldset>
            </form>
        </div>
       <script src="js/validalogin.js" type="text/javascript"></script>
       
    </body>
    
</html>
