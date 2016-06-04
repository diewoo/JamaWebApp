<%@page import="com.sw2.bean.Platillo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Bootstrap Example</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
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
    <body data-spy="scroll" data-target="#myScrollspy" data-offset="20">

        <div class="container">
            <div class="row">
                <nav class="col-sm-3" id="myScrollspy">
                    <ul class="nav nav-pills nav-stacked">

                        <%
                            for (int i = 1; i <= platillos.size(); i++) {
                        %>
                        <li><a <% if (i == 1) {%>class="active"<% }%> href="#section<%=i%>"><%=platillos.get(i-1).getNombre()%></a></li>
                            <%
                                }
                            %>
                    </ul>
                </nav>
                <div class="col-sm-9">

                    <%
                        for (Platillo plats : platillos) {
                    %>
                    <div id="section<%=cont%>" class="section">    
                        <h1><%=plats.getNombre()%></h1>
                        <p><%=plats.getDescripcion()%></p>
                    </div>
                    <%
                            cont++;
                        }
                    %>
                    <div>         
                    </div>
                </div>
            </div>
        </div>

    </body>
</html>

