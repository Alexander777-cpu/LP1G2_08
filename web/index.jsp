<%-- 
    Document   : index
    Created on : 25 may. 2025, 12:14:50
    Author     : giezi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="recursos/css/bootstrap.min.css"/>
    </head>
    <body class="vh-100 d-flex bg-body-secondary align-items-center justify-content-center">
        <div class="card p-5" style="width: 100%; max-width: 400px;">
            <div class="user d-flex justify-content-center">
                <img src="recursos/imgs/USER LOGIN IMAGE.jpg" width="200" height="200" alt="alt"/>
            </div>
            <form action="Login" method="post">
                <div class="mb-3">
                    <label for="email" class="form-label">email</label>
                    <input type="email" class="form-control" id="email" name="email" placeholder="name@example.com">
                </div>
                <div class="mb-3">
                    <label for="Password" class="form-label">Password</label>
                    <input type="Password" class="form-control" id="Password" name="password" placeholder="name@example.com">
                </div>
                <div class="d-grid gap-2">
                    <input class="btn btn-primary" type="submit"value="Enviar" >
                </div>
            </form>
        </div>

        <script src="recursos/js/bootstrap.bundle.min.js"></script>
    </body>
</html>
