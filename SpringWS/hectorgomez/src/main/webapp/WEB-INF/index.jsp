<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <!--Permite hacer anotaciones con el prefijo "c" que habilita funciones-->

        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <title>Héctor Gómez Godoy</title>
        </head>

        <body>
            <h1> Hola
                <c:out value="${nombre}"></c:out>
                <c:out value="${apellidos}"></c:out>
            </h1>
            <p>
                <c:out value="${edad}"></c:out>
            </p>

        </body>

        </html>