<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

            <!DOCTYPE html>
            <html>

            <head>
                <meta charset="UTF-8">
                <title>Editar Auto</title>
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
            </head>
            <!--Edicion:
		-capturar el id
		-buscar el objeto completo a bd
		-pasar el objeto completo al JSP
		-mostrar los datos en el JSP
		-modicar un dato, menos el ID
		-pasar el objeto modificado al controlador
		-en la nueva ruta(controlador), capturamos el objeto
		-actualizar el objeto en base datos-->

            <body>
                <div class="container">
                    <c:if test="${mensajeError!= null }">
                        <!--Si testeamos que mensaje de error es diferente a nulo, entonces-->
                        <c:out value="${mensajeError }"></c:out>
                        <!--Mostramos en la vista el mensaje de error contenido en resultado.haserror-->
                    </c:if>
                    <form:form action="/auto/actualizar/${auto.id}" method="post" modelAttribute="auto">
                        <form:label class="form-label" path="marca">Marca</form:label>
                        <form:input class="form-control" type="text" path="marca" />
                        <br>
                        <form:label class="form-label" path="color">Color</form:label>
                        <form:input class="form-control" type="text" path="color" />
                        <br>
                        <form:label class="form-label" path="velMax">Velocidad Máxima</form:label>
                        <form:input class="form-control" type="number" path="velMax" />
                        <br>
                        <input button class="btn btn-primary" type="submit" value="Guardar Auto">
                    </form:form>
                </div>
            </body>

            </html>