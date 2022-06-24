<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
            <!DOCTYPE html>
            <html>

            <head>
                <meta charset="UTF-8">
                <meta http-equiv="X-UA-Compatible" content="IE=edge">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Licencias</title>
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

            </head>

            <body>
                <div class="container">
                    <form:form action="/licencia/guardar" method="post" modelAttribute="licencia">
                        <form:label class="form-label" path="numero">Numero</form:label>
                        <form:input class="form-control" type="number" path="numero" />
                        <br>
                        <form:label class="form-label" path="fechaVencimiento">Fecha Vencimiento</form:label>
                        <form:input class="form-control" type="date" path="fechaVencimiento" />
                        <br>
                        <form:label class="form-label" path="clase">Clase</form:label>
                        <form:input class="form-control" type="text" path="clase" />
                        <br>
                        <form:label class="form-label" path="estado">Estado</form:label>
                        <form:input class="form-control" type="text" path="estado" />
                        <br>
                        <!--Desplegar opciones de usuarios-->
                        <form:select path="usuario" class="form-select">
                            <form:option value="0">Seleccione un usuario</form:option>
                            <!-- "Para cada elemento de la lista usuario, revisar si no tiene relación con una licencia (id). Si el usuario no tiene relación con una licencia, permite crearla. Si el usuario ya tiene relación con una licencia, no la muestra -->
                            <c:forEach var="usuario" items="${listaUsuarios}">
                                <!-- EL TEST DEL C: IF, ES COMO LOS () DE UN IF EN JAVA-->
                                <c:if test="${usuario.licencia.id == null}">
                                    <!--Si la relación de usuario.licencia.id no esta definida, la muestra para poder crearla-->
                                    <form:option class="form-control" value="${usuario.id}">${usuario.nombre} ${usuario.apellido}</form:option>
                                </c:if>
                            </c:forEach>
                        </form:select>
                        <br>
                        <input button class="btn btn-primary" type="submit" value="Guardar Licencia">
                    </form:form>
                    <br>
                    <br>
                    <table class="table">
                        <thead>
                            <tr>
                                <th scope="col">#</th>
                                <th scope="col">Numero Licencia</th>
                                <th scope="col">Fecha Vencimiento</th>
                                <th scope="col">Clase</th>
                                <th scope="col">Estado</th>
                                <th scope="col">Usuario</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="licencia" items="${listaLicencias}">
                                <tr>
                                    <th scope="row">${licencia.id}</th>
                                    <td>${licencia.numero}</td>
                                    <td>${licencia.fechaVencimiento}</td>
                                    <td>${licencia.clase}</td>
                                    <td>${licencia.estado}</td>
                                    <td>${licencia.usuario.nombre} ${licencia.usuario.apellido}</td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </body>

            </html>