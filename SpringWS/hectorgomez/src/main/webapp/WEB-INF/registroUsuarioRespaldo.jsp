<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!--<!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Registro</title>
    </head>

    <body>
        <div>
        Pasar información desde la vista a la URL
            Metodo get es por default, los parámetros se ven en la ruta-->
    <!--Metodo Post es para postear, los parámetros no se ven en la ruta, van ocultos-->
    <form action="/registro/usuario" method="post">
        <label for="nombre">Nombre: </label>
        <input type="text" id="nombre" name="nombre">
        <br>
        <!--SALTO DE LINEA-->
        <label for="apellido">Apellido: </label>
        <input type="text" id="apellido" name="apellido">
        <br>
        <label for="edad">Edad: </label>
        <input type="number" id="edad" name="edad">
        <br>
        <input type="submit" value="Registrar">
        <!--Envío de info (recarga la página)-->
        <input type="button" value="Enviar">
        <!-- Button por default no tiene funcion si no se le otorga-->
    </form>


    </div>

    </body>

    </html>