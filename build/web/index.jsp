<html>
    <head>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link href="assets/login.css" rel="stylesheet" type="text/css"/>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
    </head>
    <body>
        <div class="main">
            <div class="container">
                <center>
                    <div class="middle">
                        <div id="login" >
                            <h3 class="iniciarsession">Iniciar Session</h3>
                            <form action="Validaciones" method="POST">
                                <fieldset class="clearfix">
                                    <p ><span class="fa fa-user"></span><input type="text" name="txtusuario" Placeholder="Ingrese usuario" ></p> <!-- JS because of IE support; better: placeholder="Username" -->
                                    <p><span class="fa fa-lock"></span><input type="password" name="txtpass" Placeholder="Ingrese Contraseña" ></p> <!-- JS because of IE support; better: placeholder="Password" -->
                                    <div>
                                        <span style="width:48%; text-align:left;  display: inline-block;"><a class="small-text" href="olvidoclave.jsp">¿Olvido contraseña?</a></span>
                                        <span style="width:50%; text-align:right;  display: inline-block;"><input type="submit" value="Acceder" name="accion"></span>
                                    </div>
                                </fieldset>
                            </form>
                            <div class="clearfix"></div> 
                        </div> <!-- end login -->
                        <div class="logo">
                            <img src="assets/imagenes/oie_transparent.png" alt="" class="imagen"/>
                        </div>
                    </div>
                </center>
            </div>
        </div>
    </body>
</html>